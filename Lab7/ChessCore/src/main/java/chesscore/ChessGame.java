package chesscore;

public class ChessGame {
    private Board board;

    public ChessGame() {
     Board board = new Board();
    }

    private boolean isValidMove(String start,String end) {

    if(start.charAt(0)> 'h' || start.charAt(0) < 'a' || Integer.parseInt(start.substring(1)) > 0 ||
        Integer.parseInt(start.substring(1)) < 8 )
        return false;
    else if(end.charAt(0)> 'h' || end.charAt(0) < 'a' || Integer.parseInt(end.substring(1)) > 0 ||
        Integer.parseInt(end.substring(1)) < 8 )
        return false;
    else return true;
        
    }
    
    public boolean movePiece(String start,String end) {
        // Check if the move is within the board boundaries
        if (isValidMove(start,end) == false) {
            System.out.println("Invalid move. Try again.");
            return false;
        }
        return true;
    }
/*        // Check specific piece rules (not shown here for brevity)
        if (!isValidPieceMove(String start , String end)) {
            System.out.println("Invalid piece move. Try again.");
            return false;
        }

        // Perform the move
        ChessPiece piece = board[startX][startY];
        board[startX][startY] = null;
        board[endX][endY] = piece;

        System.out.println("Move successful!");
        return true;
*/ 
}