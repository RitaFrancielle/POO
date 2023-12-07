import Automoveis.Concessionaria;

public class Main {
    public static void main(String[] args) {

        Concessionaria concessionaria = new Concessionaria();

        System.out.println("Bem-vindo a Concessionaria Java, sinta-se à vontade para escolher seu carro! \n");

        // Adicionando clientes
        concessionaria.addCliente();

        // Escolha da cor do carro
        concessionaria.escolherCor();

        // Adicionando veículos iniciais
        concessionaria.adicionarVeiculosIniciais();

        // Executando a função de adicionar veículos por marca
        concessionaria.adicionarVeiculoPorMarca();

        // Salvando e carregando o estoque em um arquivo
        concessionaria.salvarEstoqueEmArquivo();
        concessionaria.carregarEstoqueDeArquivo();

        //Exibindo o estoque
        concessionaria.exibirEstoque();
    }
}