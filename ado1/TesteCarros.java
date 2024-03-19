
package ado1;

import java.util.Scanner;


public class TesteCarros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vetor vetor = new Vetor(10); // Inicia o vetor com capacidade 10

        
        //inicia o while aqui para o usuario poder escolher as opcoes 
        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar carro");
            System.out.println("2 - Exibir carros");
            System.out.println("3 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o scanner

            switch (opcao) {
                case 1:
                    System.out.println("Digite o modelo do carro:");
                    String modelo = scanner.nextLine();
                    scanner.nextLine(); // Limpa o scanner

                    System.out.println("Digite a marca do carro:");
                    String marca = scanner.nextLine();

                    System.out.println("Digite o ano do carro:");
                    int ano = scanner.nextInt();

                    System.out.println("Digite o valor do carro:");
                    double valor = scanner.nextDouble();
                    scanner.nextLine(); // Limpa o scanner
                    System.out.println("Digite a cor do carro:");
                    String cor = scanner.nextLine();

                    Carro novoCarro = new Carro(modelo, marca, ano, valor, cor);
                    vetor.adicionarCarro(novoCarro);
                    break;
                case 2:
                    vetor.exibirCarros();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}

class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private double valor;
    private String cor;

    public Carro(String modelo, String marca, int ano, double valor, String cor) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Marca: " + marca + ", Ano: " + ano + ", Valor: " + valor + ", Cor: " + cor;
    }
}

