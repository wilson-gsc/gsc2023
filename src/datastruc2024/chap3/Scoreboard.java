package datastruc2024.chap3;

/**
 * Class for storing high scores in an array in nondecreasing order.
 */
public class Scoreboard {

	/**
	 * Number of actual entries.
	 */
	private int numEntries = 0;

	/**
	 * Array of game entries (names & scores).
	 */
	private GameEntry[] board;

	/**
	 * Constructs an empty scoreboard with the given capacity for storing entries.
	 *
	 * @param capacity the capacity of the scoreboard
	 */
	public Scoreboard(int capacity) {
		board = new GameEntry[capacity];
	}

	// More methods will go here
	/**
	 * Attempt to add a new score to the collection (if it is high enough).
	 */
	public void add(GameEntry e) {
		int newScore = e.getScore();
		
		if (numEntries == 0) {
		    board[0] = e;
		    numEntries++;
		    return;
		}

		// is the new entry really a high score?
		if (numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
			if (numEntries < board.length) {
				// no score drops from the board
				// so overall number increases
				numEntries++;
			}

			// shift any lower scores rightward to make room for the new entry
			int j = numEntries - 1;
			while (j >= 0 && board[j - 1].getScore() < newScore) {
				// shift entry from j-1 to j
				board[j] = board[j - 1];
				// and decrement j
				j--;
			}

			// when done, add new entry
			board[j] = e;
		}
	}
	
	/**
	 * Remove and return the high score at index i.
	 */
	public GameEntry remove(int i) throws IndexOutOfBoundsException {
	    if (i < 0 || i >= numEntries) {
	        throw new IndexOutOfBoundsException("Invalid index: " + i);
	    }

	    GameEntry temp = board[i]; // save the object to be removed

	    // count up from i (not down)
	    for (int j = i; j < numEntries - 1; j++) {
	        board[j] = board[j + 1]; // move one cell to the left
	    }

	    // null out the old last score
	    board[numEntries - 1] = null;

	    numEntries--; // return the removed object

	    return temp;
	}
	
	/**
     * Returns the number of entries currently stored in the scoreboard.
     *
     * @return the number of entries
     */
    public int getNumEntries() {
        return numEntries;
    }

    /**
     * Returns the game entry at the specified index.
     *
     * @param i the index of the entry to retrieve
     * @return the game entry at the given index
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public GameEntry get(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i >= numEntries) {
            throw new IndexOutOfBoundsException("Invalid index: " + i);
        }
        return board[i];
    }
}
