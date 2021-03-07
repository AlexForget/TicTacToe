package tictactoe;

import java.util.Arrays;

public class Partie {
    boolean finDePartie;
    Pieces[][] tabPieces;
    int tour;

    public Partie() {
        this.finDePartie = false;
        tabPieces = new Pieces[3][3];
        tour = 1;
    }
    
    public Partie(Partie autre) {
        this.finDePartie = autre.finDePartie;
        this.tour = autre.tour;
        tabPieces = new Pieces[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.tabPieces[i][j] = autre.tabPieces[i][j];
            } 
        }
    }
    
    public void jouer(int coordX, int coordY) {
        String assignation = "";
        
        if (tabPieces[coordX][coordY] != null) {
            System.out.println("Cette case est déjà occupé");
        } else {
            if (tour % 2 == 0) {
                assignation = "X";
            } else {
                assignation = "O";
            }
        Pieces piece = new Pieces();
        tabPieces[coordX][coordY] = piece;
        piece.setAssignation(assignation);
        tour += 1;
        }
    }
    
    public boolean grillePleine(){
        boolean verification = false;
        
        if (tabPieces[0][0] != null && tabPieces[0][1] != null && tabPieces[0][2] != null
                && tabPieces[1][0] != null && tabPieces[1][1] != null && tabPieces[1][2] != null
                && tabPieces[2][0] != null && tabPieces[2][1] != null && tabPieces[2][2] != null) {
            verification = true;
        }
        return verification;
    }
    
    public boolean lignePleine() {
        boolean verification = false;
        
        if (tabPieces[0][0] != null && tabPieces[0][0].getAssignation().equalsIgnoreCase("X") 
                && tabPieces[1][0] != null && tabPieces[1][0].getAssignation().equalsIgnoreCase("X") 
                && tabPieces[2][0] != null && tabPieces[2][0].getAssignation().equalsIgnoreCase("X") ) 
            verification = true;
        
        if (tabPieces[0][1] != null && tabPieces[0][1].getAssignation().equalsIgnoreCase("X") 
                && tabPieces[1][1] != null && tabPieces[1][1].getAssignation().equalsIgnoreCase("X") 
                && tabPieces[2][1] != null && tabPieces[2][1].getAssignation().equalsIgnoreCase("X") ) 
            verification = true;
        
        if (tabPieces[0][2] != null && tabPieces[0][2].getAssignation().equalsIgnoreCase("X") 
                && tabPieces[1][2] != null && tabPieces[1][2].getAssignation().equalsIgnoreCase("X") 
                && tabPieces[2][2] != null && tabPieces[2][2].getAssignation().equalsIgnoreCase("X") ) 
            verification = true;
        
        if (tabPieces[0][0] != null && tabPieces[0][0].getAssignation().equalsIgnoreCase("X") 
                && tabPieces[0][1] != null && tabPieces[0][1].getAssignation().equalsIgnoreCase("X") 
                && tabPieces[0][2] != null && tabPieces[0][2].getAssignation().equalsIgnoreCase("X") ) 
            verification = true;
        
        if (tabPieces[1][0] != null && tabPieces[1][0].getAssignation().equalsIgnoreCase("X") 
                && tabPieces[1][1] != null && tabPieces[1][1].getAssignation().equalsIgnoreCase("X") 
                && tabPieces[1][2] != null && tabPieces[1][2].getAssignation().equalsIgnoreCase("X") ) 
            verification = true;
        
        if (tabPieces[2][0] != null && tabPieces[2][0].getAssignation().equalsIgnoreCase("X") 
                && tabPieces[2][1] != null && tabPieces[2][1].getAssignation().equalsIgnoreCase("X") 
                && tabPieces[2][2] != null && tabPieces[2][2].getAssignation().equalsIgnoreCase("X") ) 
            verification = true;
        
        if (tabPieces[0][0] != null && tabPieces[0][0].getAssignation().equalsIgnoreCase("X") 
                && tabPieces[1][1] != null && tabPieces[1][1].getAssignation().equalsIgnoreCase("X") 
                && tabPieces[2][2] != null && tabPieces[2][2].getAssignation().equalsIgnoreCase("X") ) 
            verification = true;
        
        if (tabPieces[2][0] != null && tabPieces[2][0].getAssignation().equalsIgnoreCase("X") 
                && tabPieces[1][1] != null && tabPieces[1][1].getAssignation().equalsIgnoreCase("X") 
                && tabPieces[0][2] != null && tabPieces[0][2].getAssignation().equalsIgnoreCase("X") ) 
            verification = true;
        
        if (tabPieces[0][0] != null && tabPieces[0][0].getAssignation().equalsIgnoreCase("O") 
                && tabPieces[1][0] != null && tabPieces[1][0].getAssignation().equalsIgnoreCase("O") 
                && tabPieces[2][0] != null && tabPieces[2][0].getAssignation().equalsIgnoreCase("O") ) 
            verification = true;
        
        if (tabPieces[0][1] != null && tabPieces[0][1].getAssignation().equalsIgnoreCase("O") 
                && tabPieces[1][1] != null && tabPieces[1][1].getAssignation().equalsIgnoreCase("O") 
                && tabPieces[2][1] != null && tabPieces[2][1].getAssignation().equalsIgnoreCase("O") ) 
            verification = true;
        
        if (tabPieces[0][2] != null && tabPieces[0][2].getAssignation().equalsIgnoreCase("O") 
                && tabPieces[1][2] != null && tabPieces[1][2].getAssignation().equalsIgnoreCase("O") 
                && tabPieces[2][2] != null && tabPieces[2][2].getAssignation().equalsIgnoreCase("O") ) 
            verification = true;
        
        if (tabPieces[0][0] != null && tabPieces[0][0].getAssignation().equalsIgnoreCase("O") 
                && tabPieces[0][1] != null && tabPieces[0][1].getAssignation().equalsIgnoreCase("O") 
                && tabPieces[0][2] != null && tabPieces[0][2].getAssignation().equalsIgnoreCase("O") ) 
            verification = true;
        
        if (tabPieces[1][0] != null && tabPieces[1][0].getAssignation().equalsIgnoreCase("O") 
                && tabPieces[1][1] != null && tabPieces[1][1].getAssignation().equalsIgnoreCase("O") 
                && tabPieces[1][2] != null && tabPieces[1][2].getAssignation().equalsIgnoreCase("O") ) 
            verification = true;
        
        if (tabPieces[2][0] != null && tabPieces[2][0].getAssignation().equalsIgnoreCase("O") 
                && tabPieces[2][1] != null && tabPieces[2][1].getAssignation().equalsIgnoreCase("O") 
                && tabPieces[2][2] != null && tabPieces[2][2].getAssignation().equalsIgnoreCase("O") ) 
            verification = true;
        
        if (tabPieces[0][0] != null && tabPieces[0][0].getAssignation().equalsIgnoreCase("O") 
                && tabPieces[1][1] != null && tabPieces[1][1].getAssignation().equalsIgnoreCase("O") 
                && tabPieces[2][2] != null && tabPieces[2][2].getAssignation().equalsIgnoreCase("O") ) 
            verification = true;
        
        if (tabPieces[2][0] != null && tabPieces[2][0].getAssignation().equalsIgnoreCase("O") 
                && tabPieces[1][1] != null && tabPieces[1][1].getAssignation().equalsIgnoreCase("O") 
                && tabPieces[0][2] != null && tabPieces[0][2].getAssignation().equalsIgnoreCase("O") ) 
            verification = true;
        
        return verification;
    }
    
    public String toString() {
        Pieces[][] tabPieces = new Pieces[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabPieces[i][j] = this.tabPieces[i][j]; 
            } 
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabPieces[i][j] == null) {
                    tabPieces[i][j] = new Pieces();
                    tabPieces[i][j].setAssignation(" ");
                }
            } 
        }
        return  "\n    A   B   C  "
                + "\n  -------------"
                + "\n1 |" + " " + tabPieces[0][0].getAssignation() + " " + "|" + " " + tabPieces[1][0].getAssignation() + " "  + "|" + " " + tabPieces[2][0].getAssignation() + " "  + "|"
                + "\n  -------------"
                + "\n2 |" + " " + tabPieces[0][1].getAssignation() + " " + "|" + " " + tabPieces[1][1].getAssignation() + " "  + "|" + " " + tabPieces[2][1].getAssignation() + " "  + "|"
                + "\n  -------------"
                + "\n3 |" + " " + tabPieces[0][2].getAssignation() + " " + "|" + " " + tabPieces[1][2].getAssignation() + " "  + "|" + " " + tabPieces[2][2].getAssignation() + " "  + "|"
                + "\n  -------------";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Partie other = (Partie) obj;
        if (this.finDePartie != other.finDePartie) {
            return false;
        }
        if (this.tour != other.tour) {
            return false;
        }
        if (!Arrays.deepEquals(this.tabPieces, other.tabPieces)) {
            return false;
        }
        return true;
    }

    public boolean getFinDePartie() {
        return finDePartie;
    }

    public Pieces[][] getTabPieces() {
        return tabPieces;
    }

    public int getTour() {
        return tour;
    }

    public void setFinDePartie(boolean finDePartie) {
        this.finDePartie = finDePartie;
    }

    public void setTabPieces(Pieces[][] tabPieces) {
        this.tabPieces = tabPieces;
    }

    public void setTour(int tour) {
        this.tour = tour;
    }
    
}
