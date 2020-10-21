import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int[] arr = new int[a];

        for(int i = 0; i < arr.length;i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] + 1 == arr[i +1] && arr[i] + 2 == arr[i +2]  ) {
                sum ++;
            }
        }
        System.out.print(sum);
    }
}