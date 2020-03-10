
import java.util.ArrayList;

public abstract class Framework {

    private ArrayList<Joueur> playerList;
    private ArrayList<De> deList;

    final void gameStart() {

        debutPartie();
        jouerTour();//test
        finPartie();// test ryad
        // test
    }

    public void debutPartie() {}

    public void jouerTour() {}

    public void finPartie() {

        calculerLeVainceur();
        calculerScoreTour();

    }

    abstract void calculerLeVainceur();

    abstract void calculerScoreTour();


}