import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        String flag = "NO";
        if (a + b > c && a + c > b && c + b > a) {
            flag = "YES";
        }
        System.out.println(flag);
    }
}