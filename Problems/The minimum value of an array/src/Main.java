import java.util.Arrays;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in );

        int a = scanner.nextInt();
        int[] arr = new int[a];

        for(int i= 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        System.out.print(arr[0]);

    }
}

// Второй вариант

/* Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
        int[] arr = new int[a];

        for(int i= 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int min = arr[0];
        for ( int i = 0; i < arr.length; i++) {
        if ( arr[i] < min) {
        min = arr[i];
        }
        System.out.print(min);

 */