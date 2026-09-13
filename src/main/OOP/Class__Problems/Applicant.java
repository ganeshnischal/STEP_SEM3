package main.OOP.Class__Problems;

class Desk{
    static int totalApplicants = 0;
    Desk() {
        totalApplicants++;
    }
}

public class Applicant{
    public static void main(String[] args) {

        Desk a1 = new Desk();
        Desk a2 = new Desk();
        Desk a3 = new Desk();

        System.out.println("Total applicants: " + Desk.totalApplicants);
    }
}