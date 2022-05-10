import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        ArrayList<String> listOfStrings = new ArrayList<String>();
        System.out.println("Type in at least 5 strings. Enter a blank string to stop.");
        while (true) {
            String newString = scanner.nextLine();
            int length = listOfStrings.size();
            if (newString.trim().isEmpty() && length >= 5) {
                break;
            } else if (newString.trim().isEmpty() && length < 5) {
                System.out.println("Please input at least 5 strings!");
                continue;
            } else {
                listOfStrings.add(newString);
            }
        }
        System.out.println("The fifth item in this list is: " + listOfStrings.get(4));
    }
}
