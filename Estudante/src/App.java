import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        float [] notas = new float[3];
        float media = 0.0f;

        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();

        notas = s1.getNotas();

        System.out.println("Digite seu nome: ");
        s1.setNome(sc.nextLine());

        for(int i = 0; i < notas.length; i++){
            
            System.out.printf("Digite a nota do %dº trimestre: ", i+1);
            notas[i] = sc.nextFloat();

        }


        for(int i = 0; i < notas.length; i++){
            
            media = s1.calcularMedia(notas[i], i);

        }

        s1.situacaoAluno(media);
       
        

    }
}
