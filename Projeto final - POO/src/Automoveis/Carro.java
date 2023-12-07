package Automoveis;

import Detalhes.Veiculo;

// Classe Carro que herda de VeiculoMotorizado
class Carro extends VeiculoMotorizado implements Veiculo {

    // A classe Carro possui um construtor que aceita três parâmetros
    public Carro(String marca, String modelo, double preco) {
        super(marca, modelo, preco); // Chama o construtor da classe (VeiculoMotorizado) usando super
    }

    // Implementação do método abstrato exibirDetalhes da classe VeiculoMotorizado
    @Override
    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço: R$" + preco);
    }

    // Implementação do método toFormattedString para formatar a representação do Carro em uma string
    @Override
    public String toFormattedString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Preço: R$" + preco;
    }

    // Implementação do método escolherCor da interface Veiculo
    @Override
    public void escolherCor() {
    }
}