import  java.util.ArrayList;
import  java.util.Scanner;

public class rooms {
    public static void main(String[] args) {
        ArrayList<String> rooms = new ArrayList<String>();
        rooms.add("Ann-Marie, 65, Room 12.   ");
        rooms.add("Johan, 36, Room 15.   ");
        rooms.add("Anders, 56, Room 10.   ");
        rooms.add("Matilda, 25, Room 9.   ");
        System.out.println(rooms);
        System.out.println(" Enter 1 if you want to add another room");
        try (Scanner scanner = new Scanner(System.in)) {
            String nextStep = scanner.nextLine();
            if (nextStep.equals("1")) {
                System.out.println(" Type Name, Age, Room number ");
                addToArray(rooms);
            }
        }
    }

    public static void addToArray(ArrayList<String> rooms) {
       try (Scanner scanner = new Scanner(System.in)) {
           String nextStep = scanner.nextLine();
           rooms.add(nextStep);
           System.out.println(rooms);
       }
    }
}