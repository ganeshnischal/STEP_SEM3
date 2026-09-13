package main.ClassesAndObjects.Assignment_Problems;

class DuplicatePlayerChecker {
    String findDuplicatePick(String[] playerNames) {
        for (int i = 0; i < playerNames.length; i++) {
            for (int j = i + 1; j < playerNames.length; j++) {
                if (playerNames[i].equals(playerNames[j])) {
                    return "Duplicate Found: " + playerNames[i];
                }
            }
        }
        return "No Duplicates Found";
    }
    public static void main(String[] args) {
        String[] players = {"Kohli", "Bumrah", "Kohli", "Rohit"};
        DuplicatePlayerChecker checker = new DuplicatePlayerChecker();
        System.out.println(checker.findDuplicatePick(players));
    }
}