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

    public void imprimerToner(int nombre){
        //int tempNiveauToner = niveauToner;
        if ((niveauToner - nombre) <0){
            Scanner reponses = new Scanner(System.in);
            System.out.println("Attention, il n'y aura pas assez d'encre pour l'opération ! \n " +
                    "Souhaitez-vous annuler ? (oui/non)");
            String reponse1 = reponses.nextLine().toLowerCase();
            if (reponse1 == "non"){
                nombre -= niveauToner;
                niveauToner = 0;
                System.out.println("Niveau d'encre à zéro. \n " +
                        "Souhaitez-vous remplacer le toner par un toner neuf ou usé ?");
                String reponse2 = reponses.nextLine().toLowerCase();
                if (reponse2.contains("neuf")){
                 changerTonerNeuf();
                }


            } else {
                System.out.println("Opération annulée.");
                //TODO si opé annulée, il faut réinitialiser toute l'opé! (feuilles inclues)
            }
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
