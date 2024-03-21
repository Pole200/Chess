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
    private String character;
    private Boolean isWhite;
    private ArrayList<Point> avaliblemoves(){
        return null;
    }
}
