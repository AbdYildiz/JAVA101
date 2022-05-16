package JAVA101.RecursivePattern;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        /**Kural : Girilen sayı 0 veya negatif olduğu yere kadar 
         * girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi 
         * sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan
         * sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son
         * değerini ekrana yazdırın. */
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int x = scan.nextInt();
        int y = x;
        int z = y+1;
        pattern(x,y,z);
        
        scan.close();
    }

    private static int pattern(int x, int y, int z) {
        if (x > 0 ) {
            System.out.print(" " + x);
            return pattern(x-5, y, z);
        } else if (z < y){
            System.out.print(" " + z);
            return pattern(x, y, z+5);
        } else if (y == z){
            System.out.print(" " + y);
            return y;
        } else {
            return pattern(x, y, x);
        }
    }
}
