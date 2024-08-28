import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);

        float[] notasProva = new float[2];
        float notaTrabalho;

        Aluno Daniel = new Aluno("Daniel", 10474);

        for (int i = 0; i < notasProva.length; i++) {

                System.out.printf("Digite a nota da %dª prova: %n", i+1);
                notasProva[i] = sc.nextFloat();
            
        }

        System.out.println("Digite a nota do trabalho: ");
        notaTrabalho = sc.nextFloat();


        float mediaFinal = Daniel.calcularMedia(notasProva, notaTrabalho);
        
        System.out.printf("ALUNO: %s %n", Daniel.getNome());
        System.out.printf("MATRICULA: %d %n",Daniel.getMatricula());
        System.out.printf("MÉDIA FINAL: %.1f %n",mediaFinal);
        System.out.printf("NOTA RESTANTE PARA ALCANÇAR A MÉDIA: %.1f", Daniel.calcularNotaNecessaria(mediaFinal));
        
    }
}
