package chesscore;

public class Knight extends Piece{
    
    public Knight(Color color) {
        super(PieceType.KNIGHT, color);
    }

    @Override
    public void isValidMove() {
        // Implement specific movement logic for the knight
        System.out.println("Knight moves in an L-shape: two squares in one direction and one square perpendicular.");
    }
}
