//put imports you need here
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String [5];
        int i = 0;
        while(scanner.hasNext()) {
            arr[i] = scanner.next();
            i++;
        }
        System.out.printf("The form for %s is completed."
        + "We will contact you if we need a chef that cooks %s dishes.", arr[0], arr[4]);
    }
}
