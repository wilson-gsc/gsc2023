package datastruc2024.chap3;

/**
 * Represents a game entry with a name and a score.
 */
public class GameEntry {

    /**
     * The name of the person earning this score.
     */
    private String name;

    /**
     * The score value.
     */
    private int score;

    /**
     * Constructs a game entry with given parameters.
     *
     * @param n the name of the person earning this score
     * @param s the score value
     */
    public GameEntry(String n, int s) {
        name = n;
        score = s;
    }

    /**
     * Returns the name field.
     *
     * @return the name of the person earning this score
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the score field.
     *
     * @return the score value
     */
    public int getScore() {
        return score;
    }

    /**
     * Returns a string representation of this entry.
     *
     * @return a string representation of this entry in the format "(name, score)"
     */
    public String toString() {
        return "(" + name + ", " + score + ")";
    }
}
