// Importa classes necessárias
import java.util.HashMap;
import Exceptions.ProjetoRepetidoException;
import Exceptions.NotaInsuficienteException;

// Classe que gerencia projetos na FETIN
public class Fetin {
    // Mapa para armazenar projetos pelo nome e nota associada
    private HashMap<String, Double> projetos;

    // Construtor da classe
    public Fetin() {
        // Inicializa o mapa de projetos no construtor
        this.projetos = new HashMap<>();
    }

    // Método para adicionar um projeto à FETIN, lançando exceções específicas
    public void adicionarProjeto(String nomeProjeto, double nota) throws ProjetoRepetidoException, NotaInsuficienteException {
        // Verifica se a nota é insuficiente para ser aprovado na FETIN (menor que 7.0)
        if (nota < 60.0) {
            // Lança a exceção NotaInsuficienteException com uma mensagem descritiva
            throw new NotaInsuficienteException("Nota insuficiente para ser aprovado na FETIN: " + nomeProjeto);
        }

        // Verifica se já existe um projeto com o mesmo nome no mapa
        if (projetos.containsKey(nomeProjeto)) {
            // Lança a exceção ProjetoRepetidoException com uma mensagem descritiva
            throw new ProjetoRepetidoException("Projeto com nome repetido cadastrado: " + nomeProjeto);
        }

        // Adiciona o projeto ao mapa se nenhuma exceção for lançada
        projetos.put(nomeProjeto, nota);
    }
}