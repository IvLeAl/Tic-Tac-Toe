import java.util.Arrays;
import java.util.Scanner;

class Main {
   /* public static int[] a(int[] inArr, int shift) {
    if ((inArr == null) || (inArr.length == 0) || (shift <= 0)) {
        throw new java.lang.IllegalArgumentException();
    }
    while (shift > 0) {
        int lastVar = inArr[inArr.length - 1];
        for (int counter = 0; counter < inArr.length; counter++) {
            int curVal = inArr[counter];
            inArr[counter] = lastVar;
            lastVar = curVal;
        }
        shift--;
    }
    return inArr;
}

        public static void main(String[] args) {
            int[] testArr = {1, 2, 3, 4, 5};
            testArr = a(testArr, 1);

            for (int i = 0; i < testArr.length; i++) {
                System.out.print(testArr[i] + " ");
            }
        }
}*/


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
        for ( int i= 0; i< a.length; i++) {
            System.out.print(a[i] + " ");
        }
   }

}