import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    
        // Lutador[] lutadores = new Lutador[4];

        // l[0] = new Lutador("Daniel","Brasil",19,1.75f,54f,10,2,0);

        // l[0].status();

        ArrayList<Lutador> lutadores = new ArrayList<>(); 

        lutadores.add(new Lutador("Daniel", "Brasil", 19, 1.75f, 54f, 10, 2, 0));
        lutadores.add(new Lutador("Jorge", "Portugal", 21, 1.87f, 54f,8, 5, 2));
        
        Lutador l1 = lutadores.get(0);
        Lutador l2 = lutadores.get(1);
        
        Luta ufc = new  Luta();

        ufc.marcarLuta(l1,l2);
        ufc.lutar();
        
    }

}
