package Automoveis;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;

// Classe Concessionaria representa uma concessionária de veículos
public class Concessionaria {
    // Lista que armazena o estoque de veículos motorizados
    private List<VeiculoMotorizado> estoque = new ArrayList<>();

    // Scanner para entrada de dados do usuário
    private Scanner scanner = new Scanner(System.in);

    // Caminho do arquivo para salvar o estoque
    Path arquivo = Paths.get("Estoque.txt");


    // Método para adicionar um veículo ao estoque
    public void addVeiculo(VeiculoMotorizado veiculo) {
        estoque.add(veiculo);
    }

    // Método para adicionar um cliente
    public void addCliente() {
        String nome = null;
        String cpf = null;

        // Loop para obter o nome do cliente
        do {
            try {
                System.out.print("Digite o nome do cliente: ");
                nome = validarNome(scanner.nextLine());
            } catch (IllegalArgumentException e) {
                System.err.println("Erro ao cadastrar cliente: " + e.getMessage());
                System.out.println("Por favor, corrija o nome e tente novamente.\n");
            }
        } while (nome == null);

        // Loop para obter o CPF do cliente
        do {
            try {
                System.out.print("Digite o CPF do cliente: ");
                cpf = validarCPF(scanner.nextLine());
            } catch (IllegalArgumentException e) {
                System.err.println("Erro ao cadastrar cliente: " + e.getMessage());
                System.out.println("Por favor, corrija o CPF e tente novamente.\n");
            }
        } while (cpf == null);

        // Se chegou aqui, os dados são válidos
        System.out.println("Cliente cadastrado com sucesso!\n");
    }

    // Método para validar o nome do cliente
    private String validarNome(String nome) {
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode estar vazio.");
        }

        if (!nome.matches("[a-zA-ZÀ-Úà-ú]+")) {
            throw new IllegalArgumentException("Nome deve conter apenas letras.");
        }

        return nome;
    }

    // Método para validar o CPF do cliente
    private String validarCPF(String cpf) {

        // Aqui, estou assumindo que o CPF é uma string numérica com 11 dígitos.
        if (!cpf.matches("\\d{11}")) {
            throw new IllegalArgumentException("CPF inválido. CPF tem 11 dígitos numéricos");
        }

        return cpf;
    }

    // Método para permitir ao cliente escolher a cor do veículo
    public void escolherCor() {
        System.out.println("Escolha uma cor:");
        System.out.println("1. Preto");
        System.out.println("2. Branco");
        System.out.println("3. Prata");
        System.out.println("4. Vermelho");

        int escolherCor = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.println(" ");

        String cor;
        switch (escolherCor) {
            case 1:
                cor = "Preto";
                break;
            case 2:
                cor = "Branco";
                break;
            case 3:
                cor = "Prata";
                break;
            case 4:
                cor = "Vermelho";
                break;
            default:
                System.out.println("Opção inválida. \n");
                return;
        }
    }

    // Método para adicionar alguns veículos iniciais ao estoque
    public void adicionarVeiculosIniciais() {
        addVeiculo(new Carro("Chevrolet", "Onix", 50000.0));
        addVeiculo(new Carro("Chevrolet", "Cruze", 80000.0));
        addVeiculo(new Carro("Chevrolet", "Tracker", 90000.0));

        addVeiculo(new Carro("Fiat", "Toro", 75000.0));
        addVeiculo(new Carro("Fiat", "Strada", 55000.0));
        addVeiculo(new Carro("Fiat", "Argo", 60000.0));

        addVeiculo(new Carro("Volkswagen", "Saveiro", 60000.0));
        addVeiculo(new Carro("Volkswagen", "Golf", 80000.0));
        addVeiculo(new Carro("Volkswagen", "Fox", 65000.0));

        addVeiculo(new Carro("Hyundai", "Civic", 90000.0));
        addVeiculo(new Carro("Hyundai", "HRV", 85000.0));
        addVeiculo(new Carro("Hyundai", "HB20", 55000.0));

        addVeiculo(new Carro("Renault", "Oroch", 65000.0));
        addVeiculo(new Carro("Renault", "Duster", 75000.0));
        addVeiculo(new Carro("Renault", "Sandero", 60000.0));

    }

    // Método para adicionar um veículo ao estoque com base na marca e modelo escolhidos pelo cliente
    public void adicionarVeiculoPorMarca() {
        System.out.println("Escolha uma marca:");
        System.out.println("1. Chevrolet");
        System.out.println("2. Fiat");
        System.out.println("3. Volkswagen");
        System.out.println("4. Hyundai");
        System.out.println("5. Renault");

        int escolhaMarca = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.println(" ");

        String marca;
        switch (escolhaMarca) {
            case 1:
                marca = "Chevrolet";
                break;
            case 2:
                marca = "Fiat";
                break;
            case 3:
                marca = "Volkswagen";
                break;
            case 4:
                marca = "Hyundai";
                break;
            case 5:
                marca = "Renault";
                break;
            default:
                System.out.println("Opção inválida. Saindo.");
                return;
        }

        System.out.println("Escolha um modelo para a marca " + marca + ":");
        switch (marca) {
            case "Chevrolet":
                System.out.println("1. Onix");
                System.out.println("2. Cruze");
                System.out.println("3. Tracker");
                break;
            case "Fiat":
                System.out.println("1. Toro");
                System.out.println("2. Strada");
                System.out.println("3. Argo");
                break;
            case "Volkswagen":
                System.out.println("1. Saveiro");
                System.out.println("2. Golf");
                System.out.println("3. Fox");
                break;
            case "Hyundai":
                System.out.println("1. Civic");
                System.out.println("2. HRV");
                System.out.println("3. HB20");
                break;
            case "Renault":
                System.out.println("1. Oroch");
                System.out.println("2. Duster");
                System.out.println("3. Sandero");
                break;
        }

        int escolhaModelo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.println(" ");

        String modelo = "";
        switch (escolhaModelo) {
            case 1:
                if (marca == "Chevrolet")
                    modelo = "Onix";
                if (marca == "Fiat")
                    modelo = "Toro";
                if (marca == "Volkswagen")
                    modelo = "Saveiro";
                if (marca == "Hyundai")
                    modelo = "Civic";
                if (marca == "Renault")
                    modelo = "Oroch";
                break;
            case 2:
                if (marca == "Chevrolet")
                    modelo = "Cruze";
                if (marca == "Fiat")
                    modelo = "Strada";
                if (marca == "Volkswagen")
                    modelo = "Golf";
                if (marca == "Hyundai")
                    modelo = "HRV";
                if (marca == "Renault")
                    modelo = "Duster";
                break;
            case 3:
                if (marca == "Chevrolet")
                    modelo = "Tracker";
                if (marca == "Fiat")
                    modelo = "Argo";
                if (marca == "Volkswagen")
                    modelo = "Fox";
                if (marca == "Hyundai")
                    modelo = "HB20";
                if (marca == "Renault")
                    modelo = "Sandero";
                break;
            default:
                System.out.println("Opção inválida. Saindo.");
                return;
        }

        // Remove o veículo escolhido pelo cliente do estoque
        for (int i = 0; i < estoque.size(); i++) {
            if (estoque.get(i).marca == marca && estoque.get(i).modelo == modelo){
                estoque.remove(i);
            }
        }

        // Exibe mensagem de parabéns pela compra
        System.out.println("----------------------");
        System.out.println("Parabéns pela compra!");
        System.out.println("----------------------");
    }

    // Método para exibir o estoque disponível
    public void exibirEstoque() {
        System.out.println("Estoque disponível:");
        for (int i = 0; i < estoque.size(); i++) {
            System.out.println((i + 1) + ". ");
            estoque.get(i).exibirDetalhes();
            System.out.println("----------------------");
        }
    }

    // Método para salvar o estoque em um arquivo
    public void salvarEstoqueEmArquivo() {
        try {
            List<String> conteudo = new ArrayList<>();

            // Itera sobre o estoque
            for (VeiculoMotorizado veiculo : estoque) {
                // Converte cada veículo em uma string formatada
                String linha = veiculo.toFormattedString();
                conteudo.add(linha);
            }
            // Escreve o conteúdo no arquivo
            Files.write(arquivo, conteudo);
            System.out.println("Estoque salvo com sucesso.");

        } catch (IOException e) {
            System.err.println("Erro ao salvar o estoque: " + e.getMessage());
        }
    }

    // Método para carregar o estoque de um arquivo
    public void carregarEstoqueDeArquivo() {
        processarEstoque();
        System.out.println("Estoque carregado com sucesso.\n");
    }

    // Método auxiliar para processar o estoque carregado
    private void processarEstoque() {
    }
}

