import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int k = s.nextInt();
        String flag = "NO";
        if (k < m * n && ((k % m == 0) || (k % n == 0))) {
            flag = "YES";
        }
        System.out.println(flag);
    }
}