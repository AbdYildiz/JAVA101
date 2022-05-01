import java.util.Scanner;

class KDV {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**
         *  KDV'siz Fiyat = 10;
            KDV'li Fiyat = 11.8;
            KDV tutarı = 1.8;

        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
         */

        double amount = scan.nextDouble();
        double VAT;
        System.out.println("KDV'siz Fiyat = " + amount);
        if (amount>1000) {
            VAT = amount*0.8;
        }else{
            VAT = amount*0.18;
        }
        System.out.println("KDV'li Fiyat = " + (amount + VAT));
        System.out.println("KDV tutari = " + VAT);
        
        scan.close();
    }    
}
