package JAVA101.Burclar;

import java.util.Scanner;

public class Horoscopes {
    public static void main(String[] args) {
        /**Koç Burcu : 21 Mart - 20 Nisan
           Boğa Burcu : 21 Nisan - 21 Mayıs
           İkizler Burcu : 22 Mayıs - 22 Haziran
           Yengeç Burcu : 23 Haziran - 22 Temmuz
           Aslan Burcu : 23 Temmuz - 22 Ağustos
           Başak Burcu : 23 Ağustos - 22 Eylül
           Terazi Burcu : 23 Eylül - 22 Ekim
           Akrep Burcu : 23 Ekim - 21 Kasım
           Yay Burcu : 22 Kasım - 21 Aralık
           Oğlak Burcu : 22 Aralık - 21 Ocak
           Kova Burcu : 22 Ocak - 19 Şubat
           Balık Burcu : 20 Şubat - 20 Mart 
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Dogdugunuz ayi giriniz: ");
        int month = scan.nextInt();
        System.out.print("Dogdugunuz gunu giriniz: ");
        int day = scan.nextInt();
        scan.close();

        if ( (month==12 && day>=22) || (month==1 && day<=21) ) System.out.println("Oglak burcu");
        else if ( (month==1 && day>=22) || (month==2 && day<=19) ) System.out.println("Kova burcu");
        else if ( (month==2 && day>=20) || (month==3 && day<=20) ) System.out.println("Balik burcu");
        else if ( (month==3 && day>=21) || (month==4 && day<=20) ) System.out.println("Koc burcu");
        else if ( (month==4 && day>=21) || (month==5 && day<=21) ) System.out.println("Boga burcu");
        else if ( (month==5 && day>=22) || (month==6 && day<=22) ) System.out.println("Ikizler burcu");
        else if ( (month==6 && day>=23) || (month==7 && day<=22) ) System.out.println("Yengec burcu");
        else if ( (month==7 && day>=23) || (month==8 && day<=22) ) System.out.println("Aslan burcu");
        else if ( (month==8 && day>=23) || (month==9 && day<=22) ) System.out.println("Basak burcu");
        else if ( (month==9 && day>=23) || (month==10 && day<=22) ) System.out.println("Terazi burcu");
        else if ( (month==10 && day>=23) || (month==11 && day<=21) ) System.out.println("Akrep burcu");
        else if ( (month==11 && day>=22) || (month==12 && day<=21) ) System.out.println("Yay burcu");
        else System.out.println("Gecersiz bir gun girdiniz! ");
    }
}
