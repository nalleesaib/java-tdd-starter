import java.util.ArrayList;
import java.util.List;

public class Grid {

    private List<Pawn> columns[] = new List[7];
    
    public Grid() {
        for( int col=0; col<getColumns(); col++) {
            columns[col] = new ArrayList<>();
            for( int raw=0; raw<getRows(); raw++) {
                columns[col].add(Pawn.EMPTY);
            }
        }
    }
    
    public Pawn getPawn(int column, int ligne) {
        return columns[column-1].get(ligne-1);
    }

    public Integer getColumns(){
        return 7;
    }

    public Integer getRows(){
        return 6;
    }

    public void putPawn(int column, Pawn pawn) {
        int emptyPosition = columns[column-1].indexOf(Pawn.EMPTY);
        this.columns[column-1].add(emptyPosition, pawn);
    }
}
