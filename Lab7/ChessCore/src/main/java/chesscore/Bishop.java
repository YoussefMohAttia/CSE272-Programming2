package chesscore;

public class Bishop extends Piece{
    
    public Bishop(Color color) {
        super(PieceType.BISHOP, color);
    }

    @Override
    public void isValidMove() {
        // Implement specific movement logic for the bishop
        System.out.println("Bishop moves diagonally any number of squares.");
    }
}
