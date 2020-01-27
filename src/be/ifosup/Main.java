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
        uneImprimante.imprimer(11);
        uneImprimante.imprimer(50);
        uneImprimante.ajouterFeuilles(50);
        uneImprimante.imprimer(50);
        uneImprimante.eteindreImprimante();
        System.out.println("================= une autre imprimante ==================\n");
        uneAutreImprimante.allumerImprimante();
        uneAutreImprimante.ajouterFeuilles(150);
        uneAutreImprimante.imprimer(25);
        uneAutreImprimante.imprimer(1);
        uneAutreImprimante.retirerFeuilles(20);
        uneAutreImprimante.changerTonerNiveauAIndiquer(20);
        uneAutreImprimante.imprimer(21);
        uneAutreImprimante.changerTonerNeuf();
        uneAutreImprimante.imprimer(31);
        uneAutreImprimante.changerTonerNiveauAIndiquer(40);
        uneAutreImprimante.imprimer(40);
        uneAutreImprimante.eteindreImprimante();
    }
}
