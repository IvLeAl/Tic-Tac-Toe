package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        String  inputValue;
        String enter = "Enter cells: ";

        System.out.println(enter + (inputValue = scanner.nextLine()));

        System.out.println("---------");
        System.out.println("| " + inputValue.charAt(0) + " " + inputValue.charAt(1) + " " + inputValue.charAt(2) + " |");
        System.out.println("| " + inputValue.charAt(3) + " " + inputValue.charAt(4) + " " + inputValue.charAt(5) + " |");
        System.out.println("| " + inputValue.charAt(6) + " " + inputValue.charAt(7) + " " + inputValue.charAt(8) + " |");
        System.out.println("---------");

    }
}

