import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int[] arr = new int[a];
        boolean c = false;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();


        for(int i = 1; i < a;i++) {
            if (arr[i] == val1 && arr[i - 1] == val2 || arr[i] == val2 && arr[i - 1] == val1) {
                c = true;
                break;
            }
        }
        if (c) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
