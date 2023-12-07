package Automoveis;

// Classe abstrata para veículos motorizados
abstract class VeiculoMotorizado {
    // Atributos protegidos para marca, modelo e preço do veículo
    protected String marca;
    protected String modelo;
    protected double preco;

    // Construtor que recebe marca, modelo e preço ao instanciar um veículo motorizado
    public VeiculoMotorizado(String marca, String modelo, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    // Método abstrato para exibir detalhes do veículo
    public abstract void exibirDetalhes();

    // Método para formatar a representação do veículo em uma string
    public String toFormattedString() {
        return null;
    }
}
