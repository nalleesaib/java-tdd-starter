public class StubAnalyzer implements Analyzer {
    
    Color winnerColor;
    boolean draw;

    public StubAnalyzer(Color winnerColor, boolean draw) {
        this.winnerColor = winnerColor;
        this.draw = draw;
    }

    public StubAnalyzer() {
        this.winnerColor = null;
        this.draw = false;
    }

    @Override
    public Color winnerColor() {
        return this.winnerColor;
    }

    @Override
    public Boolean isDraw() {
        return this.draw;
    }
}
