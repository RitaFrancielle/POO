// Define o pacote em que a classe está localizada
package Exceptions;

// Classe de exceção unchecked (herda de Exception, indicando que é uma exceção que não exige tratamento obrigatório)
public class NotaInsuficienteException extends Exception {

    // Construtor que aceita uma mensagem como parâmetro
    public NotaInsuficienteException(String message) {
        // Chama o construtor da classe pai (Exception) com a mensagem fornecida
        super(message);
    }
}
