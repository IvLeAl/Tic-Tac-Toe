import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int[] characters = new int[a];
        int c = scanner.nextInt();


        for (int i = 0; i < a; i++) {
            characters[i] = scanner.nextInt();
           int val = characters[i];
           if ( val == c) {
                break;
           }
        }
        System.out.println(a);
        System.out.println(characters);



    }
}