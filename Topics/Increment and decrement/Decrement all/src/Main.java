import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int[] arr = new int[4];
        int i = 0;
        while (scanner.hasNext()) {
            arr[i] = scanner.nextInt();
            i++;
        }
        for (int a : arr) {
            System.out.print((a - 1) + " ");
        }
    }
}
