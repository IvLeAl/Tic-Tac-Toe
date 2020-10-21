import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int [] arr = new int[a];

        for( int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];

        for(int i = 0;i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                System.out.print(i);
                break;
            }
        }


    }
}