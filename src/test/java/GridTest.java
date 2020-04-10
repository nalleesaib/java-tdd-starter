import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
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
    public void gridShouldHave6RowAnd7Column(){
        Grid grid = new Grid();
        int row = grid.getRows();
        int column = grid.getColumns();
        assertTrue(row == 6 && column == 7);
    }



}