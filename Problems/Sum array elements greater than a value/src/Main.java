import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = scanner.nextInt();
        }

        int b = scanner.nextInt();
        int c = 0;
        for (int val : arr) {
            if (val > b) {
                c = c + val;
            }
        }
        System.out.println(c);
    }
}