package fr.dampierre;

public class Patient {
    double poids = 0;
    double taille = 0;

    Patient(double poids, double taille) {
        if (poids > 0 & taille > 0) {
            this.poids = poids;
            this.taille = taille;
        }
    }

    public double arrondi(double nombre, int chiffres) {
        nombre *= Math.pow(10, chiffres);
        nombre = Math.round(nombre);
        return nombre / Math.pow(10, chiffres);
    }

    public String caractéristiques() {
        return "Patient : " + arrondi(poids, 1) + " kg pour " + arrondi(taille, 1) + " m (IMC : "
                + arrondi(calculerIMC(), 2) + ")";
    }

    public double calculerIMC() {
        if (taille == 0) {
            return 0;
        } else {
            return poids / Math.pow(taille, 2);
        }
    }
}
