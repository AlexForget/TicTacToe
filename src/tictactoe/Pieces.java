package tictactoe;

import java.util.Objects;

public class Pieces {
    String assignation;

    public Pieces() {
        assignation = " ";
    }

    public Pieces(String assignation) {
        this.assignation = assignation;
    }

    public Pieces(Pieces autre) {
        this(autre.assignation);
    }

    @Override
    public String toString() {
        return "Pieces{" + ", assignation=" + assignation + '}';
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
        final Pieces other = (Pieces) obj;


        if (!Objects.equals(this.assignation, other.assignation)) {
            return false;
        }
        return true;
    }


    public String getAssignation() {
        return assignation;
    }


    public void setAssignation(String assignation) {
        this.assignation = assignation;
    }


    
    
    
}
