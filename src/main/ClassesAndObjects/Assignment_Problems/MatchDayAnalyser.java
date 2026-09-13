package main.ClassesAndObjects.Assignment_Problems;

class MatchDayAnalyzer {
    double rowAverage(int[] row) {
        int sum = 0;
        for (int i = 0; i < row.length; i++) {
            sum = sum + row[i];
        }
        return (double) sum / row.length;
    }
    String classifyMatches(int[][] runsPerOver, int threshold) {
        String result = "";
        for (int i = 0; i < runsPerOver.length; i++) {
            double average = rowAverage(runsPerOver[i]);
            if (average >= threshold) {
                result = result + "Match " + i + ": Power Surge";
            } 
            else {
                result = result + "Match " + i + ": Normal";
            }
            if (i < runsPerOver.length - 1) {
                result = result + " | ";
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] runsPerOver = {{4, 6, 8}, {10, 12, 14}, {2, 3, 1}};
        int threshold = 8;
        MatchDayAnalyzer analyzer = new MatchDayAnalyzer();
        System.out.println(analyzer.classifyMatches(runsPerOver, threshold));
    }
}