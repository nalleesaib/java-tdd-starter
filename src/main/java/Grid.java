public class Grid {

    private boolean isEmpty = true;

    public Pawn getPawn(int column, int ligne) {
        if(isEmpty){
            return Pawn.EMPTY;
        }else{
            return Pawn.RED;
        }

    }

    public Integer getColumns(){
        return 7;
    }

    public Integer getRows(){
        return 6;
    }

    public void putPawn(int i, Pawn red) {
        this.isEmpty = false;
    }
}
