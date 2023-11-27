import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        Cliente c = new Cliente("Rita", 123456789);

        SistemaOperacional S1 = new SistemaOperacional("Linux Ubuntu", 32);
        SistemaOperacional S2 = new SistemaOperacional("Windows 8", 64);
        SistemaOperacional S3 = new SistemaOperacional("Windows 10", 64);

        MemoriaUSB M1 = new MemoriaUSB("Pen-drive", 16);
        MemoriaUSB M2 = new MemoriaUSB("Pen-drive", 32);
        MemoriaUSB M3 = new MemoriaUSB("HD Externo", 1);

        Computador PC1 = new Computador("Positivo", 2300, 8);
        Computador PC2 = new Computador("Acer", 5800, 16);
        Computador PC3 = new Computador("Vaio", 1800, 32);

        HardwareBasico HB1_01 = new HardwareBasico("Pentium Core i3", 2200);
        HardwareBasico HB1_02 = new HardwareBasico("Memória RAM", 8);
        HardwareBasico HB1_03 = new HardwareBasico("HD", 500);
        PC1.HWBasic(HB1_01.nome, HB1_01.capacidade);
        PC1.HWBasic(HB1_02.nome, HB1_02.capacidade);
        PC1.HWBasic(HB1_03.nome, HB1_03.capacidade);

        HardwareBasico HB2_01 = new HardwareBasico("Pentium Core i5", 3370);
        HardwareBasico HB2_02 = new HardwareBasico("Memória RAM", 16);
        HardwareBasico HB2_03 = new HardwareBasico("HD", 1);
        PC2.HWBasic(HB2_01.nome, HB2_01.capacidade);
        PC2.HWBasic(HB2_02.nome, HB2_02.capacidade);
        PC2.HWBasic(HB2_03.nome, HB2_03.capacidade);

        HardwareBasico HB3_01 = new HardwareBasico("Pentium Core i7", 4500);
        HardwareBasico HB3_02 = new HardwareBasico("Memória RAM", 32);
        HardwareBasico HB3_03 = new HardwareBasico("HD", 2);
        PC3.HWBasic(HB3_01.nome, HB3_01.capacidade);
        PC3.HWBasic(HB3_02.nome, HB3_02.capacidade);
        PC3.HWBasic(HB3_03.nome, HB3_03.capacidade);


        int compra;
        int i = 0;
        int[] cache = new int[10];
        double total = 0.0;
        System.out.println("Qual PC de qual promoção deseja comprar?");

        do {
            compra = entrada.nextInt();
            i += 1;

            if (compra == 1) {
                total += c.calculaTotalCompra(PC1);
                cache[i] = compra;
            }
            else if (compra == 2) {
                total += c.calculaTotalCompra(PC2);
                cache[i] = compra;
            }
            else if (compra == 3) {
                total += c.calculaTotalCompra(PC3);
                cache[i] = compra;
            }

        }
        while (compra != 0);

        System.out.println("Cliente: " + c.nome);
        System.out.println("CPF: " + c.CPF);
        System.out.println("-----------------");

        System.out.println("Computadores adquiridos:");

        for (i = 0; i < 10; i++) {
            if (cache[i] == 1) {
                System.out.println("Promoção 1");
                PC1.mostraPCConfigs();
                System.out.println(HB1_01.nome + " (" + HB1_01.capacidade + " MHz)");
                System.out.println(HB1_02.capacidade + " Gb de " + HB1_02.nome);
                System.out.println(HB1_03.capacidade + "Gb de " + HB1_03.nome);
                System.out.println("Sistema Operacional " + S1.nome + " (" + S1.tipo + " bits)");
                PC1.addMemoriaUSB(M1);
                System.out.println("---------------");
            }
            else if (cache[i] == 2) {
                System.out.println("Promoção 2");
                PC2.mostraPCConfigs();
                System.out.println(HB2_01.nome + " (" + HB2_01.capacidade + " MHz)");
                System.out.println(HB2_02.capacidade + " Gb de " + HB2_02.nome);
                System.out.println(HB2_03.capacidade + "Tb de " + HB2_03.nome);
                System.out.println("Sistema Operacional " + S2.nome + " (" + S2.tipo + " bits)");
                PC2.addMemoriaUSB(M2);
                System.out.println("---------------");
            }
            else if (cache[i] == 3) {
                System.out.println("Promoção 3");
                PC3.mostraPCConfigs();
                System.out.println(HB3_01.nome + " (" + HB3_01.capacidade + " MHz)");
                System.out.println(HB3_02.capacidade + " Gb de " + HB3_02.nome);
                System.out.println(HB3_03.capacidade + "Tb de " + HB3_03.nome);
                System.out.println("Sistema Operacional " + S3.nome + " (" + S3.tipo + " bits)");
                PC3.addMemoriaUSB(M3);
                System.out.println("---------------");
            }
        }

        System.out.print("Valor total da compra: R$" + total);
    }
}