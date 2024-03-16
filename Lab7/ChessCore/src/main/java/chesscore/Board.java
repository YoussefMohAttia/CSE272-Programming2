package chesscore;

public class Board {
    
    private Square[][] board;

    public Board() {
        board = new Square[8][8];
        initializeBoard();
        setup();
    }

    private void initializeBoard() {
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                char col = (char) ('a' + c);
                int row = 8 - r;
                String position = String.valueOf(col) + row;
                board[r][c] = new Square(position);
            }
        }
    }

    private void setup() {
        for (int i = 0; i < 8; i++) {
        board[1][i].setPiece(PieceType.PAWN);
        board[6][i].setPiece(PieceType.PAWN); 
        }
        board[0][0].setPiece(PieceType.ROOK);
        board[0][1].setPiece(PieceType.KNIGHT); 
        board[0][2].setPiece(PieceType.BISHOP);
        board[0][3].setPiece(PieceType.KING);         
        board[0][4].setPiece(PieceType.QUEEN);
        board[0][5].setPiece(PieceType.BISHOP);         
        board[0][6].setPiece(PieceType.KNIGHT);
        board[0][7].setPiece(PieceType.ROOK);    
        board[7][0].setPiece(PieceType.ROOK);
        board[7][1].setPiece(PieceType.KNIGHT); 
        board[7][2].setPiece(PieceType.BISHOP);
        board[7][3].setPiece(PieceType.KING);         
        board[7][4].setPiece(PieceType.QUEEN);
        board[7][5].setPiece(PieceType.BISHOP);         
        board[7][6].setPiece(PieceType.KNIGHT);
        board[7][7].setPiece(PieceType.ROOK); 
        
    }    
    
    public void printBoard() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Square tile = board[row][col];
                System.out.print(tile.getPiece()+"  ");
            }
            System.out.println();
    }
    }
    
/*
    public void placePiece(ChessPiece piece, int row, int col) {
        if (isValidPosition(row, col)) {
            board[row][col].setPiece(piece);
        } else {
            System.out.println("Invalid position for piece placement.");
        }
    }

    public void movePiece(int fromRow, int fromCol, int toRow, int toCol) {
        if (isValidPosition(fromRow, fromCol) && isValidPosition(toRow, toCol)) {
            Square fromTile = board[fromRow][fromCol];
            ChessTile toTile = board[toRow][toCol];

            if (!fromTile.isEmpty()) {
                ChessPiece pieceToMove = fromTile.getPiece();
                toTile.setPiece(pieceToMove);
                fromTile.clearTile();
            } else {
                // Handle empty source tile
                System.out.println("No piece to move from the source tile.");
            }
        } else {
            // Handle invalid positions
            System.out.println("Invalid positions for piece movement.");
        }
    }

    private boolean isValidPosition(int row, int col) {
        return row >= 0 && row < 8 && col >= 0 && col < 8;
    }
    
    public void placePiece(ChessPiece piece, String position) {
        int[] coordinates = convertPositionToCoordinates(position);
        if (coordinates != null) {
            int row = coordinates[0];
            int col = coordinates[1];
            if (isValidPosition(row, col)) {
                board[row][col].setPiece(piece);
            } else {
                System.out.println("Invalid position for piece placement.");
            }
        } else {
            System.out.println("Invalid position format.");
        }
    }

    public void movePiece(String fromPosition, String toPosition) {
        int[] fromCoordinates = convertPositionToCoordinates(fromPosition);
        int[] toCoordinates = convertPositionToCoordinates(toPosition);

        if (fromCoordinates != null && toCoordinates != null) {
            int fromRow = fromCoordinates[0];
            int fromCol = fromCoordinates[1];
            int toRow = toCoordinates[0];
            int toCol = toCoordinates[1];

            if (isValidPosition(fromRow, fromCol) && isValidPosition(toRow, toCol)) {
                ChessTile fromTile = board[fromRow][fromCol];
                ChessTile toTile = board[toRow][toCol];

                if (!fromTile.isEmpty()) {
                    ChessPiece pieceToMove = fromTile.getPiece();
                    toTile.setPiece(pieceToMove);
                    fromTile.clearTile();
                } else {
                    System.out.println("No piece to move from the source tile.");
                }
            } else {
                System.out.println("Invalid positions for piece movement.");
            }
        } else {
            System.out.println("Invalid position format.");
        }
    }

    private int[] convertPositionToCoordinates(String position) {
        if (position.length() == 2) {
            char file = position.charAt(0);
            char rank = position.charAt(1);

            if (file >= 'a' && file <= 'h' && rank >= '1' && rank <= '8') {
                int col = file - 'a';
                int row = '8' - rank;
                return new int[]{row, col};
            }
        }
        return null;
    }
    
    
    
*/
} 

