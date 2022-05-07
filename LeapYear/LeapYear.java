package JAVA101.LeapYear;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        /**Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
        100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:
        Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir. */
        Scanner scan = new Scanner(System.in);
        System.out.print("Yil giriniz: ");
        int year = scan.nextInt();
        
        if (year%400==0) {
            System.out.println(year + " bir artik yil degildir! ");
        } else if (year % 4 == 0){
            System.out.println(year + " bir artik yildir! ");            
        }else{
            System.out.println(year + " bir artik yil degildir! ");
        }
        
        scan.close();
    }
}
