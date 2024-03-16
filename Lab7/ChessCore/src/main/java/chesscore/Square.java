package chesscore;

public class Square {

    private String Position;
    private PieceType piece;

    Square(String pos) {
    Position = pos;
    piece = null;
    }
    
    public boolean isEmpty() {
        if(piece==null)
	return true;
        else return false;
    }
    
    public PieceType getPiece() {
    return piece;
    }
    
    public String getPos() {
    return Position;
    }
    
    public void setPiece(PieceType piece) {
    this.piece = piece;
    }
    
}

