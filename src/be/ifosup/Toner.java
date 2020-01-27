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

    public boolean imprimerToner(int nombre) {
        int tempNiveauToner = niveauToner;
        if ((niveauToner - nombre) < 0) {
            Scanner reponses = new Scanner(System.in);
            System.out.println("Attention, il n'y aura pas assez d'encre pour l'opération ! \n " +
            "Souhaitez-vous continuer ? (oui/non)");
            String reponse1 = reponses.nextLine().toLowerCase();
            if (reponse1 == "oui") {
                nombre -= niveauToner;
                // pour stocker le nombre qu'il reste à imprimer après le changement du toner
                niveauToner = 0;
                System.out.println("Niveau d'encre à zéro. \n " +
                "Souhaitez-vous continuer ? (oui/non)");
                String reponse3 = reponses.nextLine().toLowerCase();
                while (reponse3 == "oui") {
                    System.out.println("Souhaitez-vous remplacer le toner par un toner neuf ou usé ?");
                    String reponse2 = reponses.nextLine().toLowerCase();
                    if (reponse2.contains("neuf")) {
                        changerTonerNeuf();
                        break;
                    } else if (reponse2.contains("usé") && reponse2.contains("use")) {
                        System.out.println("Indiquez le niveau d'encre du toner usé :");
                        int nb = Integer.parseInt(reponses.nextLine());
                        changerTonerNiveauAIndiquer(nb);

                        break;
                    //TODO
                    }
                } if (reponse3 == "non") {
                    System.out.println("Opération annulée.");
                    return false;
                    //TODO si je demande ici, je dois sortir le nombre afin que le nb de feuille diminue du nombre déjà fait en encre...
                }
            } else if (reponse1 == "non") {
                System.out.println("Opération annulée.");
                return false;
                //TODO niveautoner pas changé, mais make sure nbfeuille pas changé non plus.
            }
            else {
                System.out.println("Erreur, veuillez indiquer oui ou non.");
                imprimerToner(nombre);
            }
        } else {
            niveauToner -= nombre;
            return true;
        }
        }




    public void changerTonerNeuf(){
        niveauToner = 100;
        System.out.println("Le toner a bien été changé par un toner neuf.");
    }

    public void changerTonerNiveauAIndiquer(int nombre){
        niveauToner = nombre;
        if (niveauToner > 100) {
            niveauToner = 100;
        }
        System.out.println("Le toner a bien été changé. Niveau d'encre actuel : " + niveauToner + "%.");
        if (niveauToner <=0){
            System.out.println("Attention, il n'y a plus d'encre !");
            niveauToner = 0;
        }
    }

}
