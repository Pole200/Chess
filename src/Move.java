public class Move {
    private  Point start;
    private Point end;
    private Move nextMove;

    private float advantage = 0;

    public Move(Point start, Point end, Move nextMove, float advantage) {
        this.start = start;
        this.end = end;
        this.nextMove = nextMove;
        this.advantage = advantage;
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public Move getNextMove() {
        return nextMove;
    }

    public void setNextMove(Move nextMove) {
        this.nextMove = nextMove;
    }

    public float getAdvantage() {
        return advantage;
    }

    public void setAdvantage(float advantage) {
        this.advantage = advantage;
    }
}
