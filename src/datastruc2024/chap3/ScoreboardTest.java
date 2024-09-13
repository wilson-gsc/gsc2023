package datastruc2024.chap3;

public class ScoreboardTest {
    public static void main(String[] args) {
        // Create a scoreboard with a capacity of 10
        Scoreboard scoreboard = new Scoreboard(10);

        // Insert some initial entries
        scoreboard.add(new GameEntry("Mike", 1105));
        scoreboard.add(new GameEntry("Rob", 750));
        scoreboard.add(new GameEntry("Anna", 660));
        scoreboard.add(new GameEntry("Jack", 510));
        scoreboard.add(new GameEntry("Paul", 720));
        scoreboard.add(new GameEntry("Rose", 590));

        System.out.println("Initial Scoreboard:");
        printScoreboard(scoreboard);

        // Insert a new entry (Jill, 740)
        scoreboard.add(new GameEntry("Jill", 740));

        System.out.println("\nScoreboard after inserting Jill:");
        printScoreboard(scoreboard);

        // Remove the entry for Paul (720)
        scoreboard.remove(4); // Assuming Paul is at index 4

        System.out.println("\nScoreboard after removing Paul:");
        printScoreboard(scoreboard);
    }

    private static void printScoreboard(Scoreboard scoreboard) {
        for (int i = 0; i < scoreboard.getNumEntries(); i++) {
            GameEntry entry = scoreboard.get(i);
            System.out.println(entry.getName() + ": " + entry.getScore());
        }
    }
}
