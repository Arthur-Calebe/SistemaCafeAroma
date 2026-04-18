package Test;

import Dominio.Cozinha;

import java.util.Scanner;

public class Venda {

    static Cozinha[] produtos = new Cozinha[10];
    static int contadorProdutos = 0;
    static double totalVendido = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 5){
            System.out.println("\n===== CARDAPIO CAFÉ AROMA =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Vender produto");
            System.out.println("4 - Mostrar total vendido");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    // cadastrando disponibilidade dos produtos
                    if (contadorProdutos < produtos.length) {
                        System.out.print("Nome do produto: ");
                        String tipoCafe = scanner.nextLine();

                        System.out.print("Preço do produto: ");
                        double precoCafe = scanner.nextDouble();

                        System.out.print("Quantidade em estoque: ");
                        int quantidadeEstoque = scanner.nextInt();
                        scanner.nextLine();

                        produtos[contadorProdutos] = new Cozinha(tipoCafe, precoCafe, quantidadeEstoque);
                        contadorProdutos++;

                        System.out.println("Produto cadastrado com sucesso!");
                    } else {
                        System.out.println("Limite de produtos atingido!");
                    }
                    break;
            }
        }
    }
}
