public enum Color {
    RED,YELLOW;

    public Pawn toPawn() {
        if(this==RED) return Pawn.RED;
        return Pawn.YELLOW;
    }
}
