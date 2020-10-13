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
        int [] dst = new int[b];
        System.arraycopy(a, 1, dst , 0, 4);
        dst [0] = a[i]

    }
}