package chesscore;

public class Pawn extends Piece {
   
    public Pawn(Color color) {
        super(PieceType.PAWN, color);
    }

    @Override
    public void isValidMove() {
        // Implement specific movement logic for the pawn
        System.out.println("Pawn moves forward one square, but captures diagonally. On its first move, it can advance two squares.");
    }

}
