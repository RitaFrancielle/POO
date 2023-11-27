public class Cliente {

    public String nome;
    public long CPF;

    public Cliente(String nome, long CPF){
        this.nome = nome;
        this.CPF = CPF;
    }

    public float calculaTotalCompra(Computador PC){
        return PC.preco;
    }

    public void mostrarPCs(Computador PC1){
        PC1.mostraPCConfigs();
    }
}