import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[4];
        int i = 0;
        while (scanner.hasNext()) {
            arr[i] = scanner.next();
            i++;
        }
        for (String s : arr) {
            System.out.println(s);
        }

    }
}
