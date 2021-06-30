
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        boolean flag = false;
        int i = scanner.nextInt();
        boolean f = scanner.nextBoolean();
        if (((i <= 20 && i >= 10) && !f)
                || ((i <= 25 && i >= 15) && f)) {
            flag = true;
        }
        System.out.println(flag);
    }
}