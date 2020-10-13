import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int[] arr = new int[a];

        boolean b = false;

        for (int i = 0; i < a; i++) {
            arr[i] = scanner.nextInt();//Вводим в массив числа
        }

        int c = scanner.nextInt();
        for ( int i= 0; i < a; i++) {
            if ( arr[i] == c) {
                b = true;
                break;
            }
        }
        if (b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }


    }

