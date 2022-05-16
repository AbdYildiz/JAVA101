package JAVA101.AdvancedCalculator;

import java.util.Scanner;

public class Calculator {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int select;
        String menu = "1- Toplama islemi\n"
                + "2- Cikarma islemi\n"
                + "3- Carpma islemi\n"
                + "4- Bolme islemi\n"
                + "5- Uslu Sayi Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdortgen Alan ve cevre Hesabi\n"
                + "0- Cikis Yap";

        do {
            System.out.println("Luften yapmak istediginiz islemi seciniz");
            System.out.println(menu);
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    mulptiply();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    facktoriel();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangleArea();
                    break;
                case 0:
                    System.out.println("Tekrar gorusmek uzere");
                    break;
                default:
                    System.out.println("Yanlis bir deger girdiniz, Lutfen tekrar deneyiniz");
                    break;
            }
            
        } while (select != 0);
    }

    private static void plus() {
        int x, result = 0;
        do {
            System.out.print("Toplamak istediginiz sayiyi giriniz : ");
            x = scan.nextInt();
            result += x;
            System.out.println("Sonuc : " + result);
        } while (x != 0 );
    }

    private static void minus() {
        int x, result = 0;
        do {
            System.out.print("Cikarmak istediginiz sayiyi giriniz : ");
            x = scan.nextInt();
            result -= x;
            System.out.println("Sonuc : " + result);
        } while (x != 0 );
    }

    private static void mulptiply() {
        int x, result = 0;
        do {
            System.out.print("Carpmak istediginiz sayiyi giriniz : ");
            x = scan.nextInt();
            result *= x;
            System.out.println("Sonuc : " + result);
        } while (x != 0 );
    }

    private static void division() {
        double x, y, result = 1;
        do {
            System.out.print("Payi giriniz : ");
            x = scan.nextDouble();
            System.out.print("Paydayi giriniz : ");
            y = scan.nextDouble();
            
            if (y == 0) {System.out.println("Bir sayiyi 0 a bolemezsiniz"); break;}

            result = x / y ;
            System.out.println("Sonuc : " + result);
        } while (y != 0 );
    }

    private static void power() {
        double x, y, result = 0;
        do {
            System.out.print("Ussunu almak istediginiz sayinin tabanini giriniz : ");
            x = scan.nextDouble();
            System.out.print("Sayinin ussunu giriniz : ");
            y = scan.nextDouble();
            result = Math.pow(x, y);
            System.out.println("Sonuc : " + result);
        } while (x != 0 );
    }

    private static void facktoriel() {
        int x;
        do {
            double result = 1;
            System.out.print("Faktoriyelini almak istediginiz sayiyi giriniz : ");
            x = scan.nextInt();
            for (int i = 1; i <= x; i++) {
                result *= i ;
            }
            System.out.println("Sonuc : " + result);
        } while (x != 0 );
    }

    private static void mod() {
        int x, y, result = 0;
        do {
            System.out.print("Modunu almak istediginiz sayiyi giriniz : ");
            x = scan.nextInt();
            System.out.print("Modu giriniz : ");
            y = scan.nextInt();

            if (y == 0 ) break;

            result = x % y;
            System.out.println("Sonuc : " + result);
        } while (x != 0 );
    }

    private static void rectangleArea() {
        int x, y, result = 0;
        do {
            System.out.print("Dikdortgenin uzun kenarini giriniz : ");
            x = scan.nextInt();
            System.out.print("Dikdortgenin kisa kenarini giriniz : ");
            y = scan.nextInt();
            result = x * y;
            System.out.println("Dikdortgenin alani : " + result);
        } while (x != 0 );
    }
}
