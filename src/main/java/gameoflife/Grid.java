package gameoflife;

public class Grid {

    int nombreLigne;
    int nombreColonne;
   Cell[][] cells;

    public Grid() {
    }

    public Grid(int nombreLigne, int nombreColonne) {
        this.nombreLigne = nombreLigne;
        this.nombreColonne = nombreColonne;

        cells = new Cell[nombreLigne][nombreColonne];
    }

    public void init(){
        //TODO
        /*
        for (int i = 0; i < nombreLigne; i++) {
            for (int j = 0; j < nombreColonne; j++) {

            }

        }*/
    }
}
