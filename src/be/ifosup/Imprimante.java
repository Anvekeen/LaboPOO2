package be.ifosup;

public class Imprimante {
    private String modele;
    private Toner toner;
    private Bac bac;

    public Imprimante(String modele, Toner toner, Bac bac) {
        this.modele = modele;
        this.toner = toner;
        this.bac = bac;
    }

    public void allumerImprimante(){
        System.out.println("L'imprimante s'allume");
    }

    public void imprimerFeuilles(int nombre){
        toner.imprimerToner(nombre);
        // en premier, prendre encre restant. Imprimer nombre de feuille possible
        // si finit, finit.
        // si pas assez encre, remettre encre
        // si encre remise, refaire opé
        // màj l'encre + feuilles restantes
    }

    public void ajouterFeuilles(int nombre){
        bac.ajouterFeuilles(nombre);
    }

    public void retirerFeuilles(int nombre){
        bac.retirerFeuilles(nombre);
    }

    public  void changerTonerNeuf() {
        toner.changerTonerNeuf();
    }

    public  void changerTonerNiveauAIndiquer(int nombre) {
        toner.changerTonerNiveauAIndiquer(nombre);
    }

    public void eteindreImprimante(){
        System.out.println("L'imprimante s'est éteinte.");
    }

}
