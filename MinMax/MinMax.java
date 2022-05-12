package JAVA101.MinMax;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        /**Java ile klavyeden girilen N tane sayma sayısından en 
         * büyük ve en küçük sayıları bulan ve bu sayıları ekrana
         *  yazan programı yazın. */
        Scanner scan = new Scanner(System.in);
        System.out.print("Kac tane sayi gireceksiniz : ");
        int n = scan.nextInt();
        int count = 1 ;
        int min = 999999999, max = -999999999;

        while (count != n+1) {
            System.out.print(count + ". sayiyi giriniz : ");
            int num = scan.nextInt();
            if (min > num) {
                min = num;
            } else if (max < num) {
                max = num;
            }
            count++;
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);

        scan.close();
    }
}
