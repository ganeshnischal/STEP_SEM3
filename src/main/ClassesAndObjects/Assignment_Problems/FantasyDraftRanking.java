package main.ClassesAndObjects.Assignment_Problems;

class FantasyDraftRanking implements Comparable<FantasyDraftRanking> {
    private String name;
    private int matchesPlayed;
    private double battingAverage;
    private boolean injured;
    public FantasyDraftRanking(String name, int matchesPlayed, double battingAverage, boolean injured) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }
    boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= 10;
    }
    boolean isDraftable(int matchesPlayed, boolean injured) {
        return matchesPlayed >= 5 && !injured;
    }
    public int compareTo(FantasyDraftRanking other) {
        return Double.compare(other.battingAverage, this.battingAverage);
    }
    String draftAndRank(FantasyDraftRanking[] players) {
        java.util.Arrays.sort(players);
        String result = "";
        int rank = 1;
        for (int i = 0; i < players.length; i++) {
            if (players[i].isDraftable(players[i].matchesPlayed, players[i].injured) || players[i].isDraftable(players[i].matchesPlayed)) {
                result = result + rank + ". " + players[i].name;
                rank++;
                if (rank <= 3) {
                    result = result + " | ";
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        FantasyDraftRanking[] players = {
            new FantasyDraftRanking("Virat", 15, 48.0, false),
            new FantasyDraftRanking("Rahul", 7, 55.0, false),
            new FantasyDraftRanking("Sameer", 3, 60.0, false),
            new FantasyDraftRanking("Dev", 12, 20.0, true)
        };
        FantasyDraftRanking obj = new FantasyDraftRanking("", 0, 0, false);
        System.out.println(obj.draftAndRank(players));
    }
}