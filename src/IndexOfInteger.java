import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
        System.out.println("Enter any integers. Enter '0' to stop.");
        while (true) {
            int newNumber = Integer.valueOf(scanner.nextLine());
            listOfNumbers.add(newNumber);
            if (newNumber == 0) {
                System.out.println("Done entering integers into the list");
                break;
            }
        }
        System.out.println("What number are you looking for in the list?");
        int numberQuery = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (listOfNumbers.get(i).equals(numberQuery)) {
                System.out.println(numberQuery + " is at index " + i);
            }
        }
    }
}