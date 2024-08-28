public class Funcionario {

    private String nome;
    private String sobrenome;
    private float salario;

    public Funcionario(String nome, String sobrenome, float salario) {

        this.nome = nome;
        this.sobrenome = sobrenome;

        if (salario > 0.0f) {
            this.salario = salario;
        } else {
            this.salario = 0.0f;
        }

    }

    public void exibirFuncionario(int i) {

        System.out.println("-------------------------");
        System.out.printf("FUNCIONÁRIO %d %n", i+1);
        System.out.println("-------------------------");
        System.err.println("Nome: " + nome + " " + sobrenome);
        System.err.printf("Salário: R$%.2f", salario);
        System.out.println("");
        System.out.println("");

    }

    private Funcionario get(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    private static int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    public float calculaSalarioAnual() {
        return salario * 12;
    }

    public void aumentaSalario() {

        salario += salario * 0.10f;

        System.out.println(nome + ", seu salário teve um aumento de 10%!");
        System.out.printf("Salário atual: R$%.2f", salario);
        System.out.println("");
        System.out.println("");
    }

}
