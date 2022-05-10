import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> listOfNums = new ArrayList<Integer>();
        System.out.println("Enter as many integers as you want. Enter '0' to stop.");
        while (true) {
            int newNumber = Integer.valueOf(scanner.nextLine());
            if (newNumber == 0) {
                System.out.println("You have finished entering in integers.");
                break;
            } else {
                listOfNums.add(newNumber);
            }
        }
        for (int i = 0; i < listOfNums.size(); i++) {
            if (i - (listOfNums.size() - 1) != 0) {
                System.out.print(listOfNums.get(i) + ", ");
            } else {
                System.out.print("and " + listOfNums.get(i) + " were the items in the list.");
                sum(listOfNums);
            }
        }
    }
    public static void sum(ArrayList<Integer> listOfNums) {
        int sum = 0;
        for (int k = 0; k < listOfNums.size(); k++) {
            sum += listOfNums.get(k);
        }
        System.out.println(" The sum of all these is: " + sum);
        System.out.println("What number are you looking for in the list?");
        int numberQuery = Integer.valueOf(scanner.nextLine());
        for (int j = 0; j < listOfNums.size(); j++) {
            if (listOfNums.get(j).equals(numberQuery)) {
                System.out.println(numberQuery + " is at index " + j);
            }
        }
    }
}