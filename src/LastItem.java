import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        ArrayList<String> someMoreStrings = new ArrayList<String>();
        System.out.println("Enter some strings. Enter a blank string to stop.");
        while (true) {
            String newString = scanner.nextLine();
            if (newString.trim().isEmpty()) {
                break;
            } else {
                someMoreStrings.add(newString);
            }
        }
        String lastString = someMoreStrings.get(someMoreStrings.size() - 1);
        System.out.println("The last item in this list is: " + lastString);
    }
}