package entidades;

import java.util.Scanner;

public abstract class Produto {

    String nome;
    double preco;


    public Produto(){
    
        this.nome = "";
        this.preco = 0.0;
        
    };
    
    public Produto(String nome, double preco) {

        this.nome = nome;
        this.preco = preco;

    }

    public abstract String etiquetaPreco();

    public void receberDados() {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome do produto: ");
        nome = sc.nextLine();

        System.out.println("Digite o preço do produto: R$");
        preco = sc.nextDouble();

    }

}
