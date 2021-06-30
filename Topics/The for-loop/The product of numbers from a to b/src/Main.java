import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        long sum = 1;
        if (a < b) {
            for (int i = a; i < b; i++) {
                sum = sum * i;
            }
        }
        System.out.println(sum);
    }
}