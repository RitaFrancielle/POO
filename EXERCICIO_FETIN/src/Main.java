// Importa as classes de exceção definidas no pacote Exceptions
import Exceptions.NotaInsuficienteException;
import Exceptions.ProjetoRepetidoException;

// Classe principal do programa
public class Main {

    // Método principal
    public static void main(String[] args) {
        // Cria uma instância da classe FetinManager
        Fetin fetin = new Fetin();

        // Bloco try para lidar com exceções
        try {
            // Isso deve lançar a exceção de NotaInsuficienteException
            fetin.adicionarProjeto("Projeto B", 50.0);

        } catch (NotaInsuficienteException e) {
            // Captura e trata a exceção de NotaInsuficienteException
            System.err.println("ERRO: " + e.getMessage());

        } catch (ProjetoRepetidoException e) {
            // Captura a exceção de ProjetoRepetidoException e lança uma RuntimeException
            throw new RuntimeException(e);
        }

        // Segunda tentativa com a ordem dos blocos catch invertida
        try {
            // Isso deve lançar a exceção de ProjetoRepetidoException
            fetin.adicionarProjeto("Projeto A", 80.);
            fetin.adicionarProjeto("Projeto A", 90.0);

        } catch (ProjetoRepetidoException e) {
            // Captura e trata a exceção de ProjetoRepetidoException
            System.err.println("ERRO: " + e.getMessage());

        } catch (NotaInsuficienteException e) {
            // Captura a exceção de NotaInsuficienteException e lança uma RuntimeException
            throw new RuntimeException(e);

        } finally {
            // Bloco finally que sempre é executado, independentemente de exceções
            System.out.println("Final da execução do programa.");
        }
    }
}