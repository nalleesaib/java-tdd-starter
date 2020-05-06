package gameoflife;

public class Cell {

    private CellStatus status;

    public Cell(CellStatus status) {
        this.status = status;
    }

    public boolean isAlive() {
        return status.equals(CellStatus.FULL);
    }


}
