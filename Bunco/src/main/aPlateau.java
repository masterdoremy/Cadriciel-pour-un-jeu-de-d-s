import java.util.ArrayList;

public class aPlateau {
    //

    public static void main(String[] args) {
        // TODO Vue de l'app ( M V C )

        BuncoStrategie strategie = new BuncoStrategie();

        Jeu jeuTest = new Jeu(strategie);
        strategie.setupGame();
        System.out.println("Kevin score final " + strategie.calculerScoreTour(jeuTest));
        // Version Officiel Bon push
        //
    }
}