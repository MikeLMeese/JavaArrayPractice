import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        ArrayList<String> stringList = new ArrayList<String>();
        int entryCount = stringList.size();
        System.out.println("Enter any string. Enter a blank string to stop.");
        while (true) {
            String stringEntry = scanner.nextLine();
            if (stringEntry.trim().isEmpty()) {
                break;
            } else {
                stringList.add(stringEntry);
                entryCount++;
            }
        }
        System.out.println("The total amount of items in this list was: " + entryCount);
    }
}