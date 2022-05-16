package JAVA101.RecursivePower;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        /**Java dilinde, taban ve üs değerleri kullanıcıdan alınan 
         * üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız. */
        Scanner scan = new Scanner(System.in);
        System.out.print("Tabani giriniz : ");
        int x = scan.nextInt();
        System.out.print("Ussu giriniz : ");
        int y = scan.nextInt();
        
        System.out.println("Sonuc : " + power(x,y));
        scan.close();
    }

    private static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else {
            return base * power(base, exp-1);
        }
    }
}
