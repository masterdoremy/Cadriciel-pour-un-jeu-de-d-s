import java.util.ArrayList;

public class aPlateau {
    //

    public static void main(String[] args) {
        // TODO Vue de l'app ( M V C )

        BuncoStrategie strategie = new BuncoStrategie();

        Jeu jeuTest = new Jeu(strategie);
        strategie.setupGame();
        Joueur gagnant = strategie.calculerLeVainqueur(jeuTest);

        ArrayList<Joueur> listeJoueur = jeuTest.getCollectionJoueur().getListeJoueurs();

        for (Joueur j:listeJoueur) {
            System.out.println("Joueur : "+j.getNom() + " Score : " + j.getScore());
        }

        System.out.println("Gagnant : "+gagnant);

    }
}