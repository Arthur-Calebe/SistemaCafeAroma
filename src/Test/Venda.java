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

                case 2:
                    // mostrando os produtos no estoque
                    if (contadorProdutos == 0){
                        System.out.println("Nenhum produto cadastrado!");
                    }else {
                        for (int i = 0; i < contadorProdutos; i++) {
                            produtos[i].ImprimirCozinha();
                        }
                    }
                    break;

                case 3:
                    // menu de vendas
                    System.out.println("Digite o nome do produto desejado:");
                    String produtoBusca = scanner.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < contadorProdutos; i++) {
                        if (produtos[i].getTipoCafe().equalsIgnoreCase(produtoBusca)) {
                            System.out.println("Quantidade desejada: ");
                            int quantidade = scanner.nextInt();

                            if (produtos[i].vender(quantidade)){
                                totalVendido += produtos[i].getPrecoCafe() * quantidade;
                                System.out.println("Venda finalizada com sucesso!!");
                            }

                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado){
                        System.out.println("Produto não disponível!");
                    }
                    break;


            }
        }
    }
}
