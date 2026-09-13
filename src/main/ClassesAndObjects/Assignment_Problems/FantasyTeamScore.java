package main.ClassesAndObjects.Assignment_Problems;

class FantasyTeamScore {
    void applyMultipliers(double[] playerScores, int captainIndex, int viceCaptainIndex) {
        playerScores[captainIndex] = playerScores[captainIndex] * 2;
        playerScores[viceCaptainIndex] = playerScores[viceCaptainIndex] * 1.5;
    }
    public static void main(String[] args) {
        double[] playerScores = {40, 55, 30, 62};
        int captainIndex = 1;
        int viceCaptainIndex = 3;
        FantasyTeamScore obj = new FantasyTeamScore();
        obj.applyMultipliers(playerScores, captainIndex, viceCaptainIndex);
        System.out.print("[");
        for (int i = 0; i < playerScores.length; i++) {
            System.out.print(playerScores[i]);
            if (i < playerScores.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}