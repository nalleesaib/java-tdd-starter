import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*

 1 -> shouldCheckIfPositionIsEmpty
 2 -> size of the grid
 3 -> check if position red or yellow
 4 -> number of pawn in a column
 5 -> shouldClearGrid

 Responsabilités de la classe Grid:
 - ajoute un pion, maximum 6 pions par colonne, 7 colonnes seulement.
 -donne-moi l'état de la cellule à telle colonne et telle rangée
 - vide-toi
 - représente-toi sous forme de chaine de caractères
 */
public class GridTest {
    /* Test List
     -
     - Etant donné que la grille est neuve,
       quand j'interroge son état en (1,1),
       alors la grille me répond qu'il n'y a pas de pion ici

     - Etant donné que la grille est neuve
     et que j'ajoute un pion rouge sur la colonne 1
      quand  j'interroge l'état de la grille en (1,1)
      alors la grille me répond que le pion présent est de coulour rouge

     */
    @Test
    public void shouldCheckIfPositionIsEmpty() {

      // Given - ma grille est neuve
       Grid grid = new Grid();

       //When - j'interroge l'état en (1,1)
       Pawn pawn = grid.getPawn(1,1);

       // Then - l'état est vide (pas de pion ici)
      assertThat(pawn).isEqualTo(Pawn.EMPTY);
    }

    @Test
    public void shouldcheckIfWhenGridIsEmptyAndAddonPostionOneReturnContentOfThatPosition(){

        //Given
        Grid grid = new Grid();
        //When
         grid.putPawn(1,Pawn.RED);
        Pawn pawn = grid.getPawn(1,1);
        //Then
        assertThat(pawn).isEqualTo(Pawn.RED);
    }

    @Test
    public void shouldcheckIfWhenGridIsEmptyAndAddonPostionTwoReturnContentOfThatPosition(){

        //Given
        Grid grid = new Grid();
        grid.putPawn(2,Pawn.YELLOW);
        //When
        Pawn pawn = grid.getPawn(2,1);
        //Then
        assertThat(pawn).isEqualTo(Pawn.YELLOW);
    }
    
    @Test
    public void stackingPawnsOnSameColumn() {
        // Given
        Grid grid = new Grid();
        grid.putPawn(2, Pawn.YELLOW);
        grid.putPawn(2, Pawn.RED);
        /*
             .......
             .......
             .......
             .......
             .*.....
             .O.....
         */
        
        // When
        Pawn pawnOnTop = grid.getPawn(2,2);
        Pawn pawnOnBottom = grid.getPawn(2,1);
        
        // Then
        assertThat(pawnOnTop).isEqualTo(Pawn.RED);
        assertThat(pawnOnBottom).isEqualTo(Pawn.YELLOW);
    }

    @Test
    public void stackingPawnsOnDifferentColumnsV2() {
        // Given
        Grid grid = new Grid();
        grid.putPawn(2, Pawn.YELLOW);
        grid.putPawn(2, Pawn.RED);
        grid.putPawn(4, Pawn.YELLOW);
        grid.putPawn(4, Pawn.YELLOW);
        /*
             .......
             .......
             .......
             .......
             .*.....
             .O*....
         */

        // When
        Pawn pawnOnTop = grid.getPawn(2,2);
        Pawn pawnOnRight = grid.getPawn(4,1);
        Pawn pawnOnRightTop = grid.getPawn(4,2);

        // Then
        assertThat(pawnOnTop).isEqualTo(Pawn.RED);
        assertThat(pawnOnRight).isEqualTo(Pawn.YELLOW);
        assertThat(pawnOnRightTop).isEqualTo(Pawn.YELLOW);
    }

    @Test
    public void stackingPawnsUntilOverFlow() {
        // Given
        Grid grid = new Grid();
        grid.putPawn(4, Pawn.YELLOW); // raw 1
        grid.putPawn(4, Pawn.YELLOW);
        grid.putPawn(4, Pawn.RED);
        grid.putPawn(4, Pawn.YELLOW);
        grid.putPawn(4, Pawn.RED);
        grid.putPawn(4, Pawn.YELLOW); //raw 6

        // When
        //grid.putPawn(4, Pawn.RED); //raw 7

        // Then
        assertThrows(IllegalArgumentException.class, () -> {grid.putPawn(4, Pawn.RED);});

    }



    @Test
    public void gridShouldHave6RowAnd7Column(){
        Grid grid = new Grid();
        int row = grid.getRows();
        int column = grid.getColumns();
        assertTrue(row == 6 && column == 7);
    }



}
