package JAVA101.Combination;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        /**Ödev
        N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı 
        grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. 
        N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
            Kombinasyon formülü
        C(n,r) = n! / (r! * (n-r)!) */
        Scanner scan = new Scanner(System.in);
        System.out.print("Kumenin eleman sayisini giriniz. n = ");
        int n = scan.nextInt();
        System.out.print("Olusturulacak kombinasyon sayisini giriniz. r = ");
        int r = scan.nextInt();

        double nFak=1;
        for (int i = n; i > 0; i--) {
            nFak *=i;
        }
        
        double rFak=1;
        for (int i = r; i > 0; i--) {
            rFak *=i;
        }
        
        double nrFak=1;
        for (int i = n-r; i > 0; i--) {
            nrFak *=i;
        }

        System.out.println("C(n,r) = " + nFak / (rFak * nrFak));
        scan.close();
    }
}
