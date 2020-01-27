package be.ifosup;

public class Bac {
    private int nbFeuilles;
    private String formatFeuille;

    public Bac(int nbFeuilles, String formatFeuille) {
        if (nbFeuilles > 0)
        this.nbFeuilles = nbFeuilles;
        this.formatFeuille = formatFeuille;
    }

    public boolean imprimerBac(int nombre){

    }

    public void ajouterFeuilles(int nombre){
        nbFeuilles += nombre;
        System.out.println(+ nombre +" feuilles ont été ajoutées. (Total = " + nbFeuilles + ")");
    }

    public void retirerFeuilles(int nombre){
        nbFeuilles -= nombre;
        if (nbFeuilles <=0){
            System.out.println("Attention, il n'y a plus de feuilles !");
            nbFeuilles = 0;
        } else {
            System.out.println(+nombre + " feuilles ont été retirées. (Total = " + nbFeuilles + ")");
        }
    }

}
