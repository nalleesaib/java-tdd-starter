/**
 * Faire jouer un joueur sur une colonne, dans sa couleur.
 * Déterminer à qui est-ce le tour
 * Déterminer qui est le gagnant, ou s'il y a partie nulle.
 * <p>
 * Mais la détection des alignements n'est pas codée dans l'arbitre. C'est délégué à une autre classe : Analyseur.
 * <p>
 * Concepts :
 * - notion de tour => quel joueur a quelle couleur
 */
public class GameMaster {

    Grid grid;
    Analyzer analyser;
    Player player1;
    Player player2;
    Player currentPlayer;

    public GameMaster(Grid grid, Analyzer analyser) {
        this.grid = grid;
        this.analyser = analyser;
    }

    public GameMaster() {
    }

    public void addPlayers(String firstPlayer, String secondPlayer) {
        this.player1 = new Player(firstPlayer, Color.YELLOW);
        this.player2 = new Player(secondPlayer, Color.RED);
        currentPlayer = player1;
    }

    public GameStatus play(String playerName, int colonne) {
        if(!currentPlayer.name.equals(playerName)) {
            throw new IllegalStateException();
        }
        Color playerColor = currentPlayer.color;
        grid.putPawn(colonne, playerColor.toPawn());
        switchPlayer();

        Color winnerColor = analyser.winnerColor();
        if(winnerColor==null){
            return GameStatus.IN_PROGRESS;
        } else {
//            if(winnerColor==Color.YELLOW) {
                return GameStatus.PLAYER1_WINS;
//            }
        }
    }

    private void switchPlayer() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }
    
}
