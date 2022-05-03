package JAVA101.Manav;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        /**
         *  Armut : 2,14 TL
            Elma : 3,67 TL
            Domates : 1,11 TL
            Muz: 0,95 TL
            Patlıcan : 5,00 TL
         */
        Scanner scan = new Scanner(System.in);
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5;
        double tutar=0;

        System.out.print("Armut kac kilo? : ");
        double kilo = scan.nextDouble();
        tutar += kilo*armut;       
        
        System.out.print("Elma kac kilo? : ");
        kilo = scan.nextDouble();
        tutar += kilo*elma;

        System.out.print("Domates kac kilo? : ");
        kilo = scan.nextDouble();
        tutar += kilo*domates;

        System.out.print("Muz kac kilo? : ");
        kilo = scan.nextDouble();
        tutar += kilo*muz;
        
        System.out.print("Patlican kac kilo? : ");
        kilo = scan.nextDouble();
        tutar += kilo*patlican;

        System.out.println("Toplam tutar : " + tutar);
        scan.close();
    }
}
