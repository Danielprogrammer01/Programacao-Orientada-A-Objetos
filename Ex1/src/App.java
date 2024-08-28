import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);

        int idade;
        String categoria;

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        if (idade >= 5 && idade <= 7) {
            categoria = "Infantil";
            System.out.println("CATEGORIA: " + categoria);
        } else if (idade >= 8 && idade <= 10) {
            categoria = "Infantil";
            System.out.println("CATEGORIA: " + categoria);
        } else if (idade >= 11 && idade <= 13) {
            categoria = "Juvenil";
            System.out.println("CATEGORIA: " + categoria);
        } else if (idade >= 14 && idade <= 17) {
            categoria = "Juvenil";
            System.out.println("CATEGORIA: " + categoria);
        } else if (idade >= 18 && idade <= 25) {
            categoria = "Sênior";
            System.out.println("CATEGORIA: " + categoria);1
        } else {
            System.out.println("Idade fora da faixa etária!");
        }

        sc.close();
        
    }
}

