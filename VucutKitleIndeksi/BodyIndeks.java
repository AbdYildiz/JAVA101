package JAVA101.VucutKitleIndeksi;

import java.util.Scanner;

public class BodyIndeks {
    /** Vucut kitle indeksi hesaplayan program
        = Kilo (kg) / Boy(m) * Boy(m)
     */
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Lutfen boyunuzu(m) giriniz: ");
            double boy = scan.nextDouble();
            System.out.print("Lutfen kilonuzu(kg) giriniz: ");
            int kilo = scan.nextInt();

            double indeks = kilo / (boy * boy);
            System.out.println("Vucut kitle indeksiniz = " + indeks);

            scan.close();
        }
    }
