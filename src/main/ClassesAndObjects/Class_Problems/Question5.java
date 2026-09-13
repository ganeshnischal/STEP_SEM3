package main.ClassesAndObjects.Class_Problems;

class Candidate implements Comparable<Candidate> {
    private String name;
    private double cgpa;
    private int codingScore;
    Candidate(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }
    String getName() {
        return name;
    }
    double getCgpa() {
        return cgpa;
    }
    int getCodingScore() {
        return codingScore;
    }
    double getCompositeScore() {
        return cgpa * 10 + codingScore * 0.5;
    }
    public int compareTo(Candidate other) {
        if (this.getCompositeScore() < other.getCompositeScore()) {
            return 1;
        } 
        else if (this.getCompositeScore() > other.getCompositeScore()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}

public class Question5{
    static boolean isEligible(double cgpa) {
        return cgpa >= 7.5;
    }
    static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 6.5 && codingScore >= 60;
    }
    static String shortlistAndRank(Candidate[] candidates) {
        Candidate[] shortlisted = new Candidate[candidates.length];
        int count = 0;
        for (int i = 0; i < candidates.length; i++) {
            if (isEligible(candidates[i].getCgpa()) ||isEligible(candidates[i].getCgpa(), candidates[i].getCodingScore())) {
                shortlisted[count] = candidates[i];
                count++;
            }
        }
        java.util.Arrays.sort(shortlisted, 0, count);
        String result = "";
        for (int i = 0; i < count; i++) {
            result = result + (i + 1) + ". "+ shortlisted[i].getName()+ " (" + shortlisted[i].getCompositeScore() + ")";
            if (i < count - 1) {
                result = result + " | ";
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Candidate[] candidates = {
            new Candidate("Aisha", 8.2, 40),
            new Candidate("Rohit", 6.8, 65),
            new Candidate("Meena", 6.0, 90),
            new Candidate("Karan", 7.5, 20)
        };
        System.out.println(shortlistAndRank(candidates));
    }
}