package be.ifosup;

import java.util.Scanner;

public class Toner {
    private String marque;
    private String reference;
    private int niveauToner = 100;

    public Toner(String marque, String reference, int niveauToner) {
        this.marque = marque;
        this.reference = reference;
        if (niveauToner >= 0 && niveauToner <= 100) {
            this.niveauToner = niveauToner;
        }
    }

    public boolean verifierNiveauToner(int nombre) {
        if ((niveauToner - nombre) < 0) {
            System.out.println("Erreur : pas assez d'encre. Opération annulée.\n");
            return false;
        }
        return true;
    }

    public void imprimerToner(int nombre) {
            niveauToner -= nombre;
        System.out.print("=== Niveau d'encre restant : " + niveauToner +"%. ");
    }


        public void changerTonerNeuf () {
            niveauToner = 100;
            System.out.println("Le toner a bien été changé par un toner neuf. Niveau d'encre actuel : 100%.");
        }

        public void changerTonerNiveauAIndiquer ( int nombre){
            niveauToner = nombre;
            if (niveauToner > 100) {
                niveauToner = 100;
            }
            System.out.println("Le toner a bien été changé. Niveau d'encre actuel : " + niveauToner + "%.");
            if (niveauToner <= 0) {
                System.out.println("Attention, il n'y a plus d'encre !");
                niveauToner = 0;
            }
        }
    }
