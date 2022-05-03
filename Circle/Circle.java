package JAVA101.Circle;

import java.security.cert.CertPath;
import java.util.Scanner;

public class Circle{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Dairenin yaricapini ve merkez acisinin olcusunu giriniz: ");
        int r = scan.nextInt();
        int a = scan.nextInt();
        double pi = 3.14;
        double cevresi = (2*pi*r);
        double alani = (pi*r*r);
        double aciliAlan = (pi*r*r*a)/360;

        System.out.println("Dairenin cevresi = " + cevresi );
        System.out.println("Dairenin alani = " + alani );
        System.out.println("Merkez acisi verilen dairenin alani = " + aciliAlan );

        scan.close();
    }
}