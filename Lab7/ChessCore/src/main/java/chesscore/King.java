package chesscore;

public class King extends Piece {
    
    public King(Color color) {
        super(PieceType.KING, color);
    }

    @Override
    public void isValidMove() {
        // Implement specific movement logic for the king
        System.out.println("King moves one square in any direction.");
    }
    
}
