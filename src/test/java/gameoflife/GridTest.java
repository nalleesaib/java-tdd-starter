package gameoflife;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class GridTest {

    Grid grid;


    @BeforeEach
    void setUp() {
        grid = new Grid();
        List<String>  cellToInitializes = Arrays.asList(
                new String("4,4"),
                new String("4,5")
        );

        grid.initialize(cellToInitializes);
    }

    /*
         (4,4) et (4,5)
         */
    @Test
    void shouldHaveTwoCellFilled() {
        Assertions.assertThat(grid.getCell(4,4).isAlive()).isTrue();
        Assertions.assertThat(grid.getCell(4,4).isAlive()).isTrue();
    }

    /*
    (4,4) = 1
    (4,5) = 1
    (5,4) = 2
    (2,4) = 2
     */

    @Test
    void shouldReturnAsNeigbour() {

        //vosin de 4,4
        Assertions.assertThat(grid.getCellNeighbour(3,3)).isEqualTo(1);
        Assertions.assertThat(grid.getCellNeighbour(3,4)).isEqualTo(2);
        Assertions.assertThat(grid.getCellNeighbour(3,5)).isEqualTo(2);

        Assertions.assertThat(grid.getCellNeighbour(4,3)).isEqualTo(1);
        Assertions.assertThat(grid.getCellNeighbour(4,4)).isEqualTo(1);
        Assertions.assertThat(grid.getCellNeighbour(4,5)).isEqualTo(1);

        Assertions.assertThat(grid.getCellNeighbour(5,3)).isEqualTo(1);
        Assertions.assertThat(grid.getCellNeighbour(5,4)).isEqualTo(2);
        Assertions.assertThat(grid.getCellNeighbour(5,5)).isEqualTo(2);

    }

    /*
    (4,1) = vosin 4,0  4,1  3,1  2,0  2,1
    (4,2)
     */
    @Test
    void shouldxxx() {

        Assertions.assertThat(grid.getCellNeighbour(4, 0)).isEqualTo(0);
        Assertions.assertThat(grid.getCellNeighbour(4, 1)).isEqualTo(0);
        Assertions.assertThat(grid.getCellNeighbour(3, 1)).isEqualTo(0);
        Assertions.assertThat(grid.getCellNeighbour(2, 0)).isEqualTo(0);
        Assertions.assertThat(grid.getCellNeighbour(2, 1)).isEqualTo(0);
    }

    @Test
    void cellWithLessThanTwoNeighbourWillDead() {
        Assertions.assertThat(grid.willDead(4,4)).isTrue();
        Assertions.assertThat(grid.willDead(4,5)).isTrue();

}
}