package be.ifosup;

public class Main {
    public static void main(String[] args) {
        //Exemple de main
        Imprimante uneImprimante = new Imprimante("Laserjet", new Toner("HP", "305A", 100), new Bac(50, "A4"));

        Toner unToner = new Toner("Brother", "TN-1050", 75);
        Bac unBac = new Bac(50, "A4");
        Imprimante uneAutreImprimante = new Imprimante("DCP-1612", unToner, unBac);


        uneImprimante.allumerImprimante();
        uneImprimante.ajouterFeuilles(-49);
        uneImprimante.ajouterFeuilles(10);
        uneImprimante.imprimer(11, false);
        uneImprimante.imprimer(50, true);
        uneImprimante.ajouterFeuilles(50);
        uneImprimante.imprimer(50, false);
        uneImprimante.eteindreImprimante();
        System.out.println("================= une autre imprimante ==================\n");
        uneAutreImprimante.allumerImprimante();
        uneAutreImprimante.ajouterFeuilles(75);
        uneAutreImprimante.imprimer(25, false);
        uneAutreImprimante.imprimer(1, false);
        uneAutreImprimante.retirerFeuilles(20);
        uneAutreImprimante.changerTonerNiveauAIndiquer(20);
        uneAutreImprimante.imprimer(20, true);
        uneAutreImprimante.changerTonerNeuf();
        uneAutreImprimante.imprimer(31, true);
        uneAutreImprimante.changerTonerNiveauAIndiquer(40);
        uneAutreImprimante.imprimer(40, false);
        uneAutreImprimante.eteindreImprimante();
    }
}
