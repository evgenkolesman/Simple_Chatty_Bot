import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        System.out.println(a = a % 2 == 1 ? a + 1 : a + 2);
    }
}