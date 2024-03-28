import java.awt.*;

public class GameBoard {
    private Piece[][] gameBoard = new Piece[8][8];
    private Boolean currentPlayer = true;
    private float material = 0;

    public GameBoard() {
        InitGameBoard();
        DrawGame();
    }
    public void InitGameBoard(){
        AddPiece(Piece.LeftBishop(true));
        AddPiece(Piece.LeftBishop(false));
        AddPiece(Piece.RightBishop(true));
        AddPiece(Piece.RightBishop(false));
        AddPiece(Piece.LeftRook(true));
        AddPiece(Piece.LeftRook(false));
        AddPiece(Piece.RightRook(true));
        AddPiece(Piece.RightRook(false));
        AddPiece(Piece.LeftKnight(true));
        AddPiece(Piece.LeftKnight(false));
        AddPiece(Piece.RightKnight(true));
        AddPiece(Piece.RightKnight(false));
        AddPiece(Piece.King(true));
        AddPiece(Piece.King(false));
        AddPiece(Piece.Queen(false));
        AddPiece(Piece.Queen(true));
        AddPiece(Piece.Pawns(true));
        AddPiece(Piece.Pawns(false));
    }
    private void AddPiece(Piece[] pieces){
       for(Piece p :pieces){
           AddPiece(p);
       }
    }
    private void AddPiece(Piece piece){
        gameBoard[piece.getLocation().getX()][piece.getLocation().getY()] = piece;
    }
    public void DrawGame(){
        String color;
        for (int i = 0; i<8; i++) {
            for (int j = 0; j<8; j++) {
                if ( i % 2 == j % 2 ) {
                     color = ConsoleColors.TEXT_BG_WHITE;
                } else {
                    color = ConsoleColors.TEXT_BG_BLACK;
                }
                if(gameBoard[j][i] != null){
                    System.out.print(color + " " +gameBoard[j][i].getCharacter() + ConsoleColors.TEXT_RESET);
                }else {
                    System.out.print(color + ' ' +' ' + ' ' + ' ' + ConsoleColors.TEXT_RESET);
                }
            }
            System.out.println();
        }
    }
}
