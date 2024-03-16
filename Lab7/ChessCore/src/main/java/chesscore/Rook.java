package chesscore;

public class Rook extends Piece{
    
    public Rook(Color color) {
        super(PieceType.ROOK, color);
    }

    @Override
    public void isValidMove() {
        // Implement specific movement logic for the rook
        System.out.println("Rook moves horizontally or vertically any number of squares.");
    }
}
