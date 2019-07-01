package ds;

public enum d {
    QUUEN(true, 10), KING(true, 0);

    boolean alive;
    int score;

    d(boolean alive, int score) {
        this.alive = alive;
        this.score = score;
    }
}
