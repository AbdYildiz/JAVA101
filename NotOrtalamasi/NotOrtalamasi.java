package JAVA101.NotOrtalamasi;
import java.util.Scanner;

class NotOrtalmasi{
    public static void main(String[] args) {
        //Dersleri topla ve ders sayisina bolerek not ortalamasini alan program
        //mat, fizik, kimya, turkce, tarih, muzik

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Matematik notunuz: ");
        int mat = scan.nextInt();

        System.out.print("Fizik notunuz: ");
        int fizik = scan.nextInt();
        
        System.out.print("Kimya notunuz: ");
        int kimya = scan.nextInt();
        
        System.out.print("Turkce notunuz: ");
        int turkce = scan.nextInt();
        
        System.out.print("Tarih notunuz: ");
        int tarih = scan.nextInt();
        
        System.out.print("Muzik notunuz: ");
        int muzik = scan.nextInt();
        
        float ort = (mat + fizik + kimya + turkce + tarih + muzik)/6;
        System.out.println("Not Ortalamasi: " + ort);

        String sonuc = (ort >60)? "gecti":"kaldi";
        System.out.println(sonuc);
        scan.close();
    }
}