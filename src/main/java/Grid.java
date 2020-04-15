import java.util.ArrayList;
import java.util.Arrays;
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
        if(column>getRows()){
            throw new IllegalArgumentException();
        }//end if(column>getRows()){
       Pawn lastPawn=  this.columns[column-1].get(this.getRows()-1);
        if (!lastPawn.equals(Pawn.EMPTY))
            throw new IllegalArgumentException();
        int emptyPosition = columns[column-1].indexOf(Pawn.EMPTY);
        this.columns[column-1].add(emptyPosition, pawn);
    }

    public void clear() {
        for( int col=0; col<getColumns(); col++) {
            for( int raw=0; raw<getRows(); raw++) {
                columns[col].set(raw,Pawn.EMPTY);
            }
        }//endfor( int col=0; col<getColumns(); col++) {

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
      /* for( int raw=getRows()-1; raw>=0; raw--) {
            StringBuilder  rowString = new StringBuilder();
            for( int col=0; col<getColumns()-1; col++) {
                Pawn pawn = getPawn(raw,col);
                if(pawn.equals(Pawn.YELLOW)){
                    rowString.append("*");
                }else if(pawn.equals(Pawn.YELLOW)){
                    rowString.append("o");
                }else{
                    rowString.append(".");
                }
            }
            rowString.append("\n");
            builder.append(rowString.toString());
        }//endfor( int col=0; col<getColumns(); col++) {*/
        return builder.toString();
    }
}
