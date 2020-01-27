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
        System.out.println("L'imprimante s'allume.\n");
    }

    public void imprimer(int nombre, boolean rectoVerso) {
        System.out.println("\nLancement de l'impression en cours...");
        if (!rectoVerso) {
                if (toner.verifierNiveauToner(nombre) && bac.verifierNombreFeuille(nombre)) {
                    System.out.println("=== Impression réussie. Nombre de feuilles imprimées : " + nombre + " ===");
                    toner.imprimerToner(nombre);
                    bac.imprimerBac(nombre);
                }
            } else {
                int nombrebis;
                if (nombre % 2 == 0) {
                    nombrebis = nombre / 2;
                } else {
                    nombrebis = (nombre / 2) + 1;
                }
                if (toner.verifierNiveauToner(nombre) && bac.verifierNombreFeuille(nombrebis)) {
                    System.out.println("=== Impression (recto verso) réussie. Nombre de feuilles imprimées : " + nombrebis + " ===");
                    toner.imprimerToner(nombre);
                    bac.imprimerBac(nombrebis);
                }
            }
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
        System.out.println("L'imprimante s'est éteinte.\n");
    }

}
