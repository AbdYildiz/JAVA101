package JAVA101.Harmonik;

import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        /**Java ile girilen sayının harmonik serisini bulan program yazacağız. 
         * 1 + 1/2 + 1/3 + ..... + 1/n 
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("N sayisini giriniz:");
        int n = scan.nextInt();
        double total = 0;

        for (double i = 1; i <= n; i++) {
            total += (1/i) ;
        }

        System.out.println(total);
        scan.close();
    }
}
