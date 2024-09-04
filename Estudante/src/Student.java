public class Student {

    private String nome;
    private float[] notas = new float[3];
    private float somaNotas = 0.0f;

    

    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public float[] getNotas() {
        return notas;
    }



    public void setNotas(float[] nota) {
        
        for(int i = 0; i < notas.length; i++){

            this.notas[i] = nota[i];

        }
    }

    

    public float calcularMedia(float nota,int i){

        
            if (nota <= 30.0){

                somaNotas += nota;

            } else if (nota <= 35.0){

                somaNotas += nota;

            } else if (nota <= 35.0){

                somaNotas += nota;

            } else {

                System.out.printf("Nota do %dº trimestre inválida!", i+1);

            }

        
        
        return somaNotas;
        
    }
    
    
    
    public void situacaoAluno(float somaNotas){

        if (somaNotas >= 60.0) {
            System.out.printf("NOTA FINAL = %.2f %n", somaNotas);
            System.out.printf("APROVADO%n");
        } else {
            System.out.printf("NOTA FINAL = %.2f%n", somaNotas);
            System.out.printf("REPROVADO%n");
            System.out.printf("FALTANDO %.2f Pontos%n", 60 - somaNotas);
        }


    }


}
