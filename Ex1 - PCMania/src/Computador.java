public class Computador {

    public String marca;
    public float preco;

    int totalHB = 0;

    HardwareBasico[] hardwareBasicos;

    public Computador(String marca, float preco, int HBs){
        this.marca = marca;
        this.preco = preco;

        hardwareBasicos = new HardwareBasico[HBs];
    }

    public void HWBasic(String nome, float capacidade){
        hardwareBasicos[totalHB] = new HardwareBasico(nome, capacidade);
        totalHB += 1;
    }

    public void mostraPCConfigs(){
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);
    }

    public void addMemoriaUSB(MemoriaUSB musb){
        if (preco >= 2000 && preco < 3000) {
            System.out.println("Acompanha " + musb.nome + " de " + musb.capacidade + "Gb");
        }
        else if (preco >= 5000) {
            System.out.println("Acompanha " + musb.nome + " de " + musb.capacidade + "Gb");
        }
        else {
            System.out.println("Acompanha " + musb.nome + " de " + musb.capacidade + "Tb");
        }
    }
}