package chesscore;

public abstract class Piece {
    private PieceType type;
    private Color color;

    public Piece(PieceType type, Color color) {
        this.type = type;
        this.color = color;
    }

    public PieceType getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }

    public abstract void isValidMove();

    // Additional methods for specific piece behavior can be added
}
