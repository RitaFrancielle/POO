// Define o pacote em que a classe está localizada
package Exceptions;

// Classe de exceção checked (herda de Exception, indicando que é uma exceção que deve ser tratada)
public class ProjetoRepetidoException extends Exception {

    // Construtor que aceita uma mensagem como parâmetro
    public ProjetoRepetidoException(String message) {
        // Chama o construtor da classe pai (Exception) com a mensagem fornecida
        super(message);
    }
}