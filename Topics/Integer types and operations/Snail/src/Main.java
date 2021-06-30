import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if ((h > b) && (a > b)) {
            System.out.println((h - b - 1) / (a - b) + 1);
        }
    }
}