//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[8];
        int i = 0;
        while (scanner.hasNext()) {
            arr[i] = scanner.next();
            i++;
        }
        for (int a = arr.length - 1; a >= 0; a--) {
            System.out.println(arr[a]);
        }
    }
}