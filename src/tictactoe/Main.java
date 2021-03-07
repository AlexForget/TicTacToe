package tictactoe;
import java.util.*;

public class Main {

static Scanner clavier = new Scanner(System.in);
    
    public static void main(String[] args) {
        String input;
        boolean finDePartie = false;
        
        menuPrincipal();
        Partie partie = new Partie();
        System.out.println(partie);
        
        while(!finDePartie){
            while(!partie.lignePleine() && !partie.grillePleine()) {
                input = choixCoordonne(partie.getTour());
                affecterCoordonnees(partie, input);
                System.out.println(partie);
            }
            finDePartie = true;
            if (partie.lignePleine()) {
                gagnant(partie);  
            }
            if (partie.grillePleine() && !partie.lignePleine()) {
                System.out.println("La partie c'est terminée sans gagnant.");
            }
        }
    }
    
    static public void menuPrincipal() {
        System.out.println("---------------------------------"
                + "\n **********TIC-TAC-TOE**********"
                + "\n---------------------------------"
                + "\n\nAppuyer sur 'Enter' pour commencer une partie");
        appuyerSurEnter();
    }
    
    static public void appuyerSurEnter() {
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }
    
    static public String choixCoordonne(int tour){
        String chaine;
        String[] coordonnées = new String[]{"a1", "a2", "a3", "b1", "b2", "b3", "c1", "c2", "c3"};
        boolean choix = false;
        
        if (tour % 2 == 0) {
            System.out.println("Au tour des 'X' de jouer. Veuillez choisir la case de votre choix");
        } else {
            System.out.println("Au tour des 'O' de jouer. Veuillez choisir la case de votre choix");
        }
        chaine = clavier.next();
        do {  
            for (int i = 0; i < coordonnées.length; i++) {
                if (chaine.equalsIgnoreCase(coordonnées[i])) {
                    choix = true;
                }   
            }
            if (!choix) {
                System.out.println("Choix invalide, choisissez une autre case.");
                chaine = clavier.next();
            }            
        }while (!choix);
        return chaine;
    }
    
    static public void affecterCoordonnees(Partie partie, String coordonnees) {
        String x;
        String y;
        String[] coordX = new String[]{"a", "b", "c"};
        String[] coordY = new String[]{"1", "2", "3"};
        int emplacementX = 0;
        int emplacementY = 0;
        
        x = coordonnees.substring(0, 1);
        y = coordonnees.substring(1);
        
        for (int i = 0; i < coordX.length; i++) {
            if (x.equalsIgnoreCase(coordX[i])) {
                emplacementX = i;
            }
        }
        
        for (int i = 0; i < coordY.length; i++) {
            if (y.equalsIgnoreCase(coordY[i])) {
                emplacementY = i;
            }
        }
        partie.jouer(emplacementX, emplacementY);
    }
    
    static public void gagnant(Partie partie) {
        String chaine;
        
        if (partie.getTour() % 2 == 0) {
                    chaine = "'O'";
                    System.out.println("Félécitation au " + chaine + " ! Vous avez gagné la partie");
                } else {
                    chaine = "'X'";
                    System.out.println("Félécitation au " + chaine + " ! Vous avez gagné la partie");
                }
    }    
}
