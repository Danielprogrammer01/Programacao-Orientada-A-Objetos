public class Student {

    private String nome;
    private float[] notas = new float[3];

    public float calcularMedia(float[]notas){

        float somaNotas = 0.0f;
        
        for(int i = 0; i < notas.length;i++){

            if (i == 0 && notas[0] <= 30.0){

                somaNotas += notas[0];

            } else if (i == 1 && notas[1] <= 35.0){

                somaNotas += notas[1];

            } else if (i == 2 && notas[2] <= 35.0){

                somaNotas += notas[2];

            } else {

                System.out.printf("Nota do %dº trimestre inválida!",i+1);

            }

        }
        
        return somaNotas/notas.length;
        
    }
    
    
    
    public void situacaoAluno(){



    }


}
