package chesscore;

public class Queen extends Piece{
    
    public Queen(Color color) {
        super(PieceType.QUEEN, color);
    }

    @Override
    public void isValidMove() {
        // Implement specific movement logic for the queen
        System.out.println("Queen moves diagonally, horizontally, or vertically any number of squares.");
    }
}
