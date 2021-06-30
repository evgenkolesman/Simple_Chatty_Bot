import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);
        String flag;
        if (s.nextInt() > 0) {
            flag = "YES";
        }
        else {
            flag = "NO";
        }
        System.out.println(flag);
    }
}