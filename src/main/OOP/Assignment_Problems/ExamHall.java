package main.OOP.Assignment_Problems;

class HallName{
    String hallName;
    int seatsFilled;
}

public class ExamHall{
    public static void main(String[] args) {
        HallName hallA = new HallName();
        HallName hallB = new HallName();
        hallA.hallName = "Block-3 Hall A";
        hallB.hallName = "Block-3 Hall B";
        hallA.seatsFilled++;
        hallA.seatsFilled++;
        hallA.seatsFilled++;
        hallA.seatsFilled++;
        System.out.println(hallA.hallName + " seatsFilled: " + hallA.seatsFilled);
        System.out.println(hallB.hallName + " seatsFilled: " + hallB.seatsFilled);
    }
}