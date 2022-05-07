package JAVA101.TamBolme;

import java.util.Scanner;

public class TamBolme {
    public static void main(String[] args) {
        /**Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 
         * 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız. */
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        int total = 0, count=0;

        for (int i = 1; i <= sayi; i++) {
            if(i%3==0 && i %4==0){
                total +=i;
                count++;
            }  
        }
        System.out.println("ortalama = " + total/count);

        scan.close();
    }
}
