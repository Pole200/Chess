import java.awt.*;

public class GameBoard {
    private Piece[][] gameBoard = new Piece[8][8];
    private Boolean currentPlayer = true;
    private float material = 0;

    public GameBoard() {
        InitGameBoard();
        DrawGame();
        System.out.println(translateBoardToFEN());
    }

    public void InitGameBoard() {
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

    private void AddPiece(Piece[] pieces) {
        for (Piece p : pieces) {
            AddPiece(p);
        }
    }

    private void AddPiece(Piece piece) {
        gameBoard[piece.getLocation().getX()][piece.getLocation().getY()] = piece;
    }

    public void DrawGame() {
        String color;
        for (int i = 0; i < 8; i++) {
            System.out.print(8-i);
            for (int j = 0; j < 8; j++) {
                if (i % 2 == j % 2) {
                    color = ConsoleColors.TEXT_BG_WHITE;
                } else {
                    color = ConsoleColors.TEXT_BG_BLACK;
                }
                if (gameBoard[j][i] != null) {
                    System.out.print(color + gameBoard[j][i].getCharacter() + ConsoleColors.TEXT_RESET);
                } else {
                    System.out.print(color + "　" + ConsoleColors.TEXT_RESET);
                }
            }
            System.out.println();
        }
        System.out.println(" A B C D E F G H");
    }

    public String translateBoardToFEN() {
        StringBuilder fen = new StringBuilder();
        for (int rank = 0; rank < gameBoard.length; rank++) {
            // count empty fields
            int empty = 0;
            // empty string for each rank
            StringBuilder rankFen = new StringBuilder();
            for (int file = 0; file < gameBoard[rank].length; file++) {
                if (gameBoard[file][rank] == null) {
                    empty++;
                } else {
                    // add the number to the fen if not zero.
                    if (empty != 0) rankFen.append(empty);
                    // add the letter to the fen
                    char c = ' ';
                    switch ((gameBoard[file][rank].getCharacter().charAt(0))) {
                        case '♔':
                            c = 'k';
                            break;
                        case '♚':
                            c = 'K';
                            break;
                        case '♕':
                            c = 'q';
                            break;
                        case '♛':
                            c = 'Q';
                            break;
                        case '♖':
                            c = 'r';
                            break;
                        case '♜':
                            c = 'R';
                            break;
                        case '♘':
                            c = 'n';
                            break;
                        case '♞':
                            c = 'N';
                            break;
                        case '♗':
                            c = 'b';
                            break;
                        case '♝':
                            c = 'B';
                            break;
                        case '♙':
                            c = 'p';
                            break;
                        case '♟':
                            c = 'P';
                            break;
                    }
                    rankFen.append(c);
                    // reset the empty
                    empty = 0;
                }
            }
            // add the number to the fen if not zero.
            if (empty != 0) rankFen.append(empty);
            // add the rank to the fen
            fen.append(rankFen);
            // add rank separator. If last then add a space
            if (!(rank == gameBoard.length - 1)) {
                fen.append("/");
            } else {
                fen.append(" ");
            }
        }
        return fen.toString();
    }
}
