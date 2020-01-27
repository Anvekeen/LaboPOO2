package be.ifosup;

public class Bac {
    private int nbFeuilles;
    private String formatFeuille;

    public Bac(int nbFeuilles, String formatFeuille) {
        if (nbFeuilles >= 0)
        this.nbFeuilles = nbFeuilles;
        this.formatFeuille = formatFeuille;
    }

    public boolean verifierNombreFeuille(int nombre) {
        if ((nbFeuilles - nombre) < 0) {
            System.out.println("Erreur : pas assez de feuilles. Opération annulée.\n");
            return false;
        }
        return true;
    }

    public void imprimerBac(int nombre) {
            nbFeuilles -= nombre;
        System.out.println("Nombre de feuilles restantes : " + nbFeuilles + " ===\n");
    }

    public void ajouterFeuilles(int nombre){
        nbFeuilles += nombre;
        if (nbFeuilles <= 0){
            nbFeuilles = 0;
            System.out.println("Il n'y a plus de feuilles dans le bac.");
        } else if (nombre < 0) {
            System.out.println(+ Math.abs(nombre) +" feuilles ont été retirées. (Total = " + nbFeuilles + ")");
        } else {
            System.out.println(+nombre + " feuilles ont été ajoutées. (Total = " + nbFeuilles + ")");
        }
    }

    public void retirerFeuilles(int nombre){
        nombre = Math.abs(nombre);
        nbFeuilles -= nombre;
        if (nbFeuilles <=0){
            System.out.println("Attention, il n'y a plus de feuilles !");
            nbFeuilles = 0;
        } else {
            System.out.println(+nombre + " feuilles ont été retirées. (Total = " + nbFeuilles + ")");
        }
    }

}
