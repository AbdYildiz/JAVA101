package JAVA101.Power;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        /**Java döngüler ile girilen sayıya kadar olan 4 ve 5'in 
         * kuvvetlerini ekrana yazdıran programı yazıyoruz. */
        Scanner scan = new Scanner(System.in);
        System.out.print("4^n ifadesi icin n = ");
        int n = scan.nextInt();

        int four = 4, five = 5;

        for (int i = 0; i <= n ; i++) {
            System.out.println("4^" + i + "=" + Math.pow(four, i));
        }
        
        for (int i = 0; i <= n ; i++) {
            System.out.println("5^" + i + "=" + Math.pow(five, i));
        }
        
        scan.close();
    }
}
