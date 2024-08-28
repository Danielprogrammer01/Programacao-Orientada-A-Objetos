import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);

        ContaCorrente Daniel = new ContaCorrente(0, null, 0);
        
        System.out.println("Digite o nome: ");
        Daniel.setNome(sc.nextLine());
        
        System.out.println("Digite o numero da conta: ");
        Daniel.setNumeroDaConta(sc.nextInt());

        System.out.println("Digite o saldo: ");
        Daniel.setSaldo(sc.nextFloat());

        System.out.println("Digite o valor para depositar: R$ ");
        Daniel.realizarDeposito(sc.nextFloat());

        System.out.println("Saldo atual: R$ " + Daniel.getSaldo());

        System.out.println("Digite o valor para sacar: R$ ");
        Daniel.realizarSaque(sc.nextFloat());

        System.out.println("Saldo atual: R$ " + Daniel.getSaldo());

        sc.close();

    
    }
}
