package JAVA101.Even;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        /**Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri
         *  kabul eden ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
         Ödev
         Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri 
         kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları 
         toplayıp ekrana basan programı yazıyoruz. */
        Scanner scan= new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;  

        while (sayi>=0) {
            System.out.print("Bir sayi giriniz: ");
            sayi = scan.nextInt();
            if (sayi%2==1) {
                toplam +=sayi;
                System.out.println(toplam);
            }
        }
        System.out.println("ODEV");
        
        int num = 0;
        int total = 0;
        
        while (num%2==0) {
            System.out.print("Bir sayi giriniz: ");
            num = scan.nextInt();
            if (num%2==0 || num%4==0) {
                total +=num;
                System.out.println(total);
            }
        } 

        scan.close();
    }
}
