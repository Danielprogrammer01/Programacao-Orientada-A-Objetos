public class Aluno {

    private String nome;
    private int matricula;
    private float[] notaProva = new float[2];
    private float notaTrabalho; 

    public Aluno(String nome, int matricula){

        this.nome = nome;
        this.matricula = matricula;

    }

    public String getNome() {
        return nome;
    }


    public int getMatricula() {
        return matricula;
    }


    public float calcularMedia(float[] notaProva, float notaTrabalho){

        float mediaFinal = 0.0f;
        float somaNotasProva = 0.0f;
        float pesoProva = 2.5f * notaProva.length;
        float pesoTrabalho = 2.0f;
        float somaPesos = pesoProva + pesoTrabalho;
        
        for(int i = 0; i < notaProva.length; i++){

            somaNotasProva += (notaProva[i] * 2.5f);
        
        }

        mediaFinal = (somaNotasProva + (notaTrabalho * pesoTrabalho)) / somaPesos;

        return mediaFinal;

    }

    public float calcularNotaNecessaria(float mediaFinal){

        if (mediaFinal >= 7.0) {

            return 0;

        } else{

            return (7.0f - mediaFinal);

        }
    }
}
