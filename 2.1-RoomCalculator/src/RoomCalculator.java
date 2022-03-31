import java.util.Scanner;

public class RoomCalculator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
    	String answer = "Yes";

    		do {
    			System.out.println("What is the length of the room?");
                int length = (int) scnr.nextDouble();

                System.out.println("What is the width?");
                int width = (int) scnr.nextDouble();

                System.out.println("The area is " + length * width);

                System.out.println("The perimeter is " + (length + width) * 2);

                System.out.println("Do you want to calculate another room?");
                answer = scnr.next();
                } while (answer.equalsIgnoreCase("Yes"));
        }
}