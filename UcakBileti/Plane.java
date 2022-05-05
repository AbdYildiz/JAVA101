package JAVA101.UcakBileti;

import java.util.Scanner;

public class Plane {
    public static void main(String[] args) {
        /**--Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
         *  yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya 
         * "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        --Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        --Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        --Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        --Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır. */
        Scanner scan = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        int km = scan.nextInt();
        System.out.print("Yasininiz giriniz: ");
        int age = scan.nextInt();
        System.out.print("Yolculuk tipini seciniz (1 -> Tek yon, 2 -> Gidis ve Donus) : ");
        int opt = scan.nextInt();

        double total = km * 0.10;

        if (opt==2) total = total*0.8 * 2; //gidis donus bileti old icin 2 ile carpilir
        else if (!(opt==1 || opt==2))   System.out.println("Hatali veri girdiniz!");
        else if (km<0)                  System.out.println("Hatali veri girdiniz!");

        if (age<12)                     total = total*0.5; 
        else if (age >=12 && age <=24)  total = total*0.90; 
        else if (age >65)               total = total*0.70;

        System.out.println("Toplam tutar = " + total);
        scan.close();
    }
}
