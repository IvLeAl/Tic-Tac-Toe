import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [][] arr = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
         boolean ismatch = true;
        for(int k = 0; k < arr.length; k++) {
            for(int l = 0; l < arr.length; l++) {
                if (arr[k][l] != arr[l][k]) {
                    ismatch = false;
                    break;
                }
            }
        }

        if(ismatch==false) {
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
    }

}