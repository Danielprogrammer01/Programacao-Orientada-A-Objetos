
import java.util.Random;

public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador desafiante, Lutador desafiado) {

        if (desafiante.getCategoria() == desafiado.getCategoria() && desafiante != desafiado) {

            aprovada = true;
            this.desafiante = desafiante;
            this.desafiado = desafiado;

        } else {

            aprovada = false;
            this.desafiante = null;
            this.desafiado = null;

        }

    }

    public void lutar() {

        if (aprovada) {

            System.out.println("DESAFIANTE: " + desafiante.getNome());
            desafiante.apresentar();

            System.out.println("DESAFIADO: " + desafiado.getNome());
            desafiado.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            switch (vencedor) {

                case 0:

                    System.out.println("Vitória do lutador " + desafiante.getNome());
                    desafiante.ganharLuta();
                    desafiado.perderLuta();

                    break;

                case 1:

                    System.out.println("Vitória do lutador " + desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();

                    break;

                case 2:

                    System.out.println("A luta entre " + desafiante.getNome() + " e " + desafiado.getNome() + " deu EMPATE!");
                    desafiante.empatarLuta();
                    desafiado.empatarLuta();

                    break;
            }

        } else {

            System.out.println("A luta não pôde acontecer!");
        }

    }

}