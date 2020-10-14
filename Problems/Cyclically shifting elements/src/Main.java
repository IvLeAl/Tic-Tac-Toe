import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int b = scanner.nextInt();
        int[] a = new int[b];


        for ( int i= 0; i < b; i++) {
            a[i] = scanner.nextInt();
        }
        int c = a[a.length-1];
        for (int i = a.length -2; i >= 0; i--) {
            a[i+1] = a[i];
        }
        a[0] = c;
        System.out.print(Arrays.toString(a));
    }
}