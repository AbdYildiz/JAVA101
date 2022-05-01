import java.util.Scanner;

class Hesapla{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden yaziniz: ");
        int km = scan.nextInt();
        /**
        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
         */
        double ucret = 10 + (km * 2.20);
        ucret = (ucret<20)? 20:ucret;
        System.out.println("toplam ucret = "+ ucret);
        scan.close();
    }
}