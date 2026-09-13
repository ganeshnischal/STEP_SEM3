package main.OOP.Class__Problems;

class Separate{
    String roomNo;
    int occupied;
}
public class Hostelroom{
    public static void main(String[] args) {
        Separate roomA = new Separate();
        Separate roomB = new Separate();
        roomA.roomNo = "C-101";
        roomB.roomNo = "C-102";
        roomA.occupied++;
        roomA.occupied++;
        roomA.occupied++;
        System.out.println(roomA.roomNo + " occupied: " + roomA.occupied);
        System.out.println(roomB.roomNo + " occupied: " + roomB.occupied);
    }
}