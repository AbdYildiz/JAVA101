package JAVA101.PerfectNumber;

import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        /**Bir sayının kendisi hariç pozitif tam sayı çarpanları 
         * (kalansız bölen sayıların) toplamı kendisine eşit olan 
         * sayıya mükemmel sayı denir. */
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int num = scan.nextInt();
        int total = 0;
        int count = 1;

        while (count < num) {
            if (num%count==0) {
                total += count;
                count++;
            } else {
                count++;
            }
        }

        if (num == total) {
            System.out.println(num + " Mukemmel sayidir");
        } else {
            System.out.println(num + " Mukemmel sayi degildir");
        }
        
        scan.close();
    }
}
