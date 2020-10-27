import java.util.Scanner;
class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] twoArray = new int[n][n];


        for (int i = 0; i < twoArray.length; i++) {
            for(int j = 0; j < twoArray[i].length; j++) {
                if(j == n/2 || i == n/2||j == i|| j == n-(i+1)){
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
