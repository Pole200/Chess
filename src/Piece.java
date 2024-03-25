import java.util.ArrayList;

public class Piece {
    private Point location;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Piece(Point location, String name, String character, Boolean isWhite) {
        this.location = location;
        this.name = name;
        this.character = character;
        this.isWhite = isWhite;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public Boolean getWhite() {
        return isWhite;
    }

    public void setWhite(Boolean white) {
        isWhite = white;
    }

    private String character = "  ";
    private Boolean isWhite;

    private ArrayList<Point> avaliblemoves() {
        return null;
    }

    public static Piece King(boolean color) {
        if (color) {
            return new Piece(new Point(4, 0), "white king", "♔", true);
        } else {
            return new Piece(new Point(4, 7), "white king", "♚", false);
        }
    }

    public static Piece Queen(boolean color) {
        if (color) {
            return new Piece(new Point(3, 0), "white queen", "♕", true);
        } else {
            return new Piece(new Point(3, 7), "black queen", "♛", false);
        }
    }

    public static Piece LeftRook(boolean color) {
        if (color) {
            return new Piece(new Point(0, 0), "white rook", "♖", true);
        } else {
            return new Piece(new Point(0, 7), "black rook", "♜", false);
        }
    }
    public static Piece LeftKnight(boolean color) {
        if (color) {
            return new Piece(new Point(1, 0), "white knight", "♘", true);
        } else {
            return new Piece(new Point(1, 7), "black knight", "♞", false);
        }
    }

    public static Piece RightKnight(boolean color) {
        if (color) {
            return new Piece(new Point(6, 0), "white rook", "♘", true);
        } else {
            return new Piece(new Point(6, 7), "black rook", "♞", false);
        }
    }

    public static Piece RightRook(boolean color) {
        if (color) {
            return new Piece(new Point(7, 0), "white rook", "♖", true);
        } else {
            return new Piece(new Point(7, 7), "black rook", "♜", false);
        }
    }

    public static Piece LeftBishop(boolean color) {
        if (color) {
            return new Piece(new Point(2, 0), "white bishop", "♗", true);
        } else {
            return new Piece(new Point(2, 7), "black bishop", "♝", false);
        }
    }

    public static Piece RightBishop(boolean color) {
        if (color) {
            return new Piece(new Point(5, 0), "white bishop", "♗", true);
        } else {
            return new Piece(new Point(5, 7), "black bishop", "♝", false);
        }
    }

    public static Piece[] Pawns(boolean color) {
        Piece[] arr = new Piece[8];
        for (int i = 0; i < 8; i++) {
            if (color) {
                arr[i] = new Piece(new Point(i, 1), "white pawn", "♙", true);
            } else {
                arr[i] = new Piece(new Point(i, 6), "black pawn", "♟", false);
            }
        }
        return arr;
    }
}
