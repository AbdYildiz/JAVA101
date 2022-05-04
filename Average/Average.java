package JAVA101.Average;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        /**Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
        Geçme Notu : 55
        Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın. 
        */
        int mat, fizik, turkce, kimya, muzik, total = 0, count =0;
        System.out.print("Matematik: ");
        mat = scan.nextInt();
        System.out.print("Fizik: ");
        fizik = scan.nextInt();
        System.out.print("Turkce: ");
        turkce = scan.nextInt();
        System.out.print("Kimya: ");
        kimya = scan.nextInt();
        System.out.print("Muzik: ");
        muzik = scan.nextInt();

        if (mat>0 && mat<100) {total += mat; count +=1;}
        if (fizik>0 && fizik<100) {total += fizik; count +=1;}
        if (turkce>0 && turkce<100) {total += turkce; count +=1;}
        if (kimya>0 && kimya<100) {total += kimya; count +=1;}
        if (muzik>0 && muzik<100) {total += muzik; count +=1;}

        double average = total / count;
        
        if (average >= 55) System.out.println("Sinifi gectiniz ");
        else System.out.println("Sinifta kaldiniz ");

        System.out.println("Ortalamaniz = " + average);
        scan.close();
    }
}
