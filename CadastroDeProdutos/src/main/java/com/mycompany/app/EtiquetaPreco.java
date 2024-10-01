package com.mycompany.app;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoNormal;
import entidades.ProdutoUsado;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

public class EtiquetaPreco {

    public static void main(String[] args) {

        String nome = null;
        double preco = 0;
        int codigo;
        int contador = 0;
        ArrayList<Produto> arrayProduto = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello World!");

        System.out.println("Digite o número de produtos: ");
        int n = sc.nextInt();

        do {

            System.out.println("|==============================|");
            System.out.println("|       MENU DE CADASTRO       |");
            System.out.println("|==============================|");
            System.out.println("| (1) - Produto Normal         |");
            System.out.println("| (2) - Produto Importado      |");
            System.out.println("| (3) - Produto Usado          |");
            System.out.println("| (4) - Encerrar cadastro      |");
            System.out.println("|------------------------------|");

            System.out.println("Digite a opção desejada:");
            codigo = sc.nextInt();
            sc.nextLine();

            contador++;

            switch (codigo) {

                case 1:

                    ProdutoNormal pn = new ProdutoNormal();
                    
                    pn.receberDados();

                    arrayProduto.add(pn);

                    System.out.print(pn.etiquetaPreco());

                    break;


                case 2:

                    double taxaAlfandega;

                    System.out.println("Digite o nome do produto: ");
                    nome = sc.nextLine();

                    System.out.println("Digite o preço do produto: R$");
                    preco = sc.nextDouble();

                    System.out.println("Digite a taxa da alfândega: R$");
                    taxaAlfandega = sc.nextDouble();

                    ProdutoImportado pi = new ProdutoImportado(nome, preco, taxaAlfandega);

                    arrayProduto.add(pi);

                    System.out.print(pi.etiquetaPreco());

                    break;

                case 3:

                    LocalDate dataFabricacao;
                    int dia,
                     mes,
                     ano;

                    System.out.println("Digite o nome do produto: ");
                    nome = sc.nextLine();

                    System.out.println("Digite o preço do produto: R$");
                    preco = sc.nextDouble();

                    System.out.println("Digite a data de fabricação:");
                    System.out.println("Dia: ");
                    dia = sc.nextInt();
                    System.out.println("Mês: ");
                    mes = sc.nextInt();
                    System.out.println("Ano: ");
                    ano = sc.nextInt();

                    dataFabricacao = LocalDate.of(ano, mes, dia);

                    ProdutoUsado pu = new ProdutoUsado(nome, preco, dataFabricacao);

                    arrayProduto.add(pu);

                    System.out.print(pu.etiquetaPreco());

                    break;

                case 4:
                    System.out.println("Encerrando cadastro...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;

            }

            if (contador == n) {
                System.out.println("Limite de cadastro atingido!");
            }

        } while (codigo != 4 && contador < n);

        sc.close();

    }
}
