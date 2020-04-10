import java.util.ArrayList;
import java.util.List;

public class Grid {

    private List<Pawn> pawns;
    
    public Grid() {
        pawns = new ArrayList<>();
        for( int i=0; i<getRows(); i++) {
            pawns.add(Pawn.EMPTY);
        }
    }
    
    public Pawn getPawn(int column, int ligne) {
        return pawns.get(ligne-1);
    }

    public Integer getColumns(){
        return 7;
    }

    public Integer getRows(){
        return 6;
    }

    public void putPawn(int column, Pawn pawn) {
        int emptyPosition = pawns.indexOf(Pawn.EMPTY);
        this.pawns.add(emptyPosition, pawn);
    }
}
