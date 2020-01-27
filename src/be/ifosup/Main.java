package be.ifosup;

public class Main {
    public static void main(String[] args) {
        //Exemple de main

        Imprimante uneImprimante = new Imprimante("Laserjet", new Toner("HP", "305A", 100), new Bac(50, "A4"));

        Toner unToner = new Toner("Brother", "TN-1050", 75);
        Bac unBac = new Bac(15, "A4");
        Imprimante uneAutreImprimante = new Imprimante("DCP-1612", unToner, unBac);






    }
}
