import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, World!");
        
        Invoice loja = new Invoice(null, null, 0, 0);

        System.out.println("Digite o ID do item: ");
        loja.setIdItem(sc.nextLine());

        System.out.println("Digite a descrição do item: ");
        loja.setDescricaoItem(sc.nextLine());

        System.out.println("Digite a quantidade comprada: ");
        loja.setQuantidadeComprada(sc.nextInt());

        System.out.print("Digite o preço unitário do item: R$");
        loja.setPrecoUnitario(sc.nextFloat());

        loja.imprimirFatura();
        
        sc.close();

    }
}
