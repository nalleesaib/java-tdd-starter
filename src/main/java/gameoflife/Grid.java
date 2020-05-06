package gameoflife;

import java.util.List;

public class Grid {

    private Cell[][] cells;


    public Grid() {
        cells = new Cell[GridConstants.MAX_LIGN][GridConstants.MAX_COLUMN];
    }

    public Cell getCell(int row, int column){
        return cells[row][column];
    }


    public void initialize(List<String> positionToInitializes) {
        for (int row = 0; row < GridConstants.MAX_LIGN; row++) {
            initializeRow(row);
        }
        for(String position : positionToInitializes){
            String[] cellIndexes = position.split(",");
            cells[Integer.parseInt(cellIndexes[0])][Integer.parseInt(cellIndexes[1])] = new Cell(CellStatus.FULL);
        }
    }

    private void initializeRow(int row) {
        for (int column = 0; column < GridConstants.MAX_COLUMN ; column++) {
            cells[row][column] = new Cell(CellStatus.EMPTY);
        }
    }


    public int getCellNeighbour(int row, int column) {
        if (isOutOfBound(row, column)) return 0;
        int neigbbours = 0;
        neigbbours += getNeigbbour(row - 1, column - 1);
        neigbbours += getNeigbbour(row-1, column);
        neigbbours += getNeigbbour(row-1, column+1);

        neigbbours += getNeigbbour(row, column-1);
        neigbbours += getNeigbbour(row, column+1);

        neigbbours += getNeigbbour(row+1, column-1);
        neigbbours += getNeigbbour(row+1, column);
        neigbbours += getNeigbbour(row+1, column+1);


        return neigbbours;
    }

    private boolean isOutOfBound(int row, int column) {
        if(row == 0 || column == 0){
            return true;
        }
        if(row == GridConstants.MAX_LIGN-1 || column == GridConstants.MAX_COLUMN-1){
            return true;
        }
        return false;
    }

    private int getNeigbbour(int row, int column) {
        return getCell(row, column).isAlive() ? 1 : 0;
    }


    public boolean willDead(int row, int column) {
        return  (getCellNeighbour(row,column)<2);
    }
}
