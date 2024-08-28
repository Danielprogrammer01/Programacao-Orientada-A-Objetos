import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ArrayList<Funcionario> funcionario = new ArrayList<>();

        funcionario.add(new Funcionario("Daniel", "Correia", 5000f));
        funcionario.add(new Funcionario("Ane", "Rocha", 1000f));

        for(int i = 0; i < funcionario.size(); i++){
            funcionario.get(i).exibirFuncionario(i);
        }
        
        funcionario.get(0).aumentaSalario();
        funcionario.get(1).aumentaSalario();
        
        //funcionario.get(0).exibirFuncionario(0);

        for(int i = 0; i < funcionario.size(); i++){
            funcionario.get(i).exibirFuncionario(i);
        }
        


    }
}
