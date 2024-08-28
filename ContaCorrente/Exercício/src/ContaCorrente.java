import java.util.Scanner;

public class ContaCorrente {

    private int numeroDaConta;
    private String nomeCorrentista;
    private float saldo;

    public ContaCorrente(int numeroDaConta, String nomeCorrentista,float saldo){

        setNome(nomeCorrentista);
        setNumeroDaConta(numeroDaConta);
        setSaldo(saldo);

    }

    public void  setSaldo(float saldo) {
        
        this.saldo = saldo;

    }

    public float getSaldo() {
        
        return this.saldo;

    }

    public void setNome(String nomeCorrentista) {
        
        this.nomeCorrentista = nomeCorrentista;

    }
    public void  setNumeroDaConta(int numeroDaConta) {
        
        this.numeroDaConta = numeroDaConta;

    }

    public void alterarNome(String nomeCorrentista){

        System.out.println("Nome do Correntista: " + nomeCorrentista);
        System.out.println("Digite o nome para alterar: ");
        this.nomeCorrentista = sc.nextLine();
        
    }

    public void realizarSaque(float saque){
    
        this.saldo -= saque;
    }

    public void realizarDeposito(float deposito){
        
        this.saldo += deposito;
        
    }

    
}
