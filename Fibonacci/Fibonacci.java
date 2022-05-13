package JAVA101.Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        /**Java döngüler ile fibonacci serisi bulan program yazıyoruz. 
         * Fibonacci serisinin eleman sayısını kullanıcıdan alın. */
        Scanner scan = new Scanner(System.in);
        System.out.print("Fibonacci'nin eleman sayisini giriniz: ");
        int n = scan.nextInt();

        double a = 0, b = 1, c;

        for (int i = 0; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + "   ");
        }

        scan.close();
    }
}
