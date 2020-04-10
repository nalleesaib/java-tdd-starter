import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GameMasterTest {

    @Test
    public void shouldPlay() {
        // Given
        Grid grid = new Grid();
        Analyzer analyser = new StubAnalyzer();
        GameMaster gameMaster = new GameMaster(grid, analyser);
        gameMaster.addPlayers("Julien", "André");

        // When
        gameMaster.play("Julien", 2);

        // Then
        assertThat(grid.getPawn(2, 1)).isEqualTo(Pawn.YELLOW);
    }

    @Test
    public void shouldPlayTwice() {
        // Given
        Grid grid = new Grid();
        Analyzer analyser = new StubAnalyzer();
        GameMaster gameMaster = new GameMaster(grid, analyser);
        gameMaster.addPlayers("Julien", "André");

        // When
        gameMaster.play("Julien", 2);
        gameMaster.play("André", 1);

        // Then
        assertThat(grid.getPawn(2, 1)).isEqualTo(Pawn.YELLOW);
        assertThat(grid.getPawn(1, 1)).isEqualTo(Pawn.RED);
    }

    @Test
    public void shouldNotCheat() {
        // Given
        Grid grid = new Grid();
        Analyzer analyser = new StubAnalyzer();
        GameMaster gameMaster = new GameMaster(grid, analyser);
        gameMaster.addPlayers("Julien", "André");

        // When
        gameMaster.play("Julien", 2);

        // Then
        assertThrows(IllegalStateException.class, () -> gameMaster.play("Julien", 1));
    }
    
    @Test
    public void gameShouldBeInProgress() {
        // Given
        Grid grid = new Grid();
        Analyzer analyser = new StubAnalyzer();
        GameMaster gameMaster = new GameMaster(grid, analyser);
        gameMaster.addPlayers("Julien", "André");

        // When
        GameStatus gameStatus = gameMaster.play("Julien", 2);

        // Then
        assertThat(gameStatus).isEqualTo(GameStatus.IN_PROGRESS);
        
    }
    
    @Test
    public void player1ShouldWinTheGame() {
        // Given
        Grid grid = new Grid();
        StubAnalyzer analyser = new StubAnalyzer();
        GameMaster gameMaster = new GameMaster(grid, analyser);
        gameMaster.addPlayers("André", "Julien");

        analyser.winnerColor = Color.YELLOW;
        
        // When
        GameStatus gameStatus = gameMaster.play("André", 2);
        
        // Then
        assertThat(gameStatus).isEqualTo(GameStatus.PLAYER1_WINS);
        
    }


}
