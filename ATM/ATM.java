package JAVA101.ATM;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        /**Java döngüler ile kullanıcının banka hesabını yönetebildiği bir ATM projesi yapıyoruz.
         * Ödev
         * Aynı projedeki ATM işlemlerini "Switch-Case" kullanarak yapınız.
         */
        String userName, password;
        Scanner scan = new Scanner(System.in);
        int right = 3, balance = 1500, select, amount;

        while (right>0) {
            System.out.print("Kullanici adi: ");
            userName = scan.nextLine();
            System.out.print("Password: ");
            password = scan.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasina Hosgeldiniz");
                do {
                    System.out.println(" 1-Para cekme\n 2-Para yatirma\n "
                                        + " 3-Bakiye sorgulama\n 4-Cikis ");
                    System.out.print("Yapmak istediginiz islemi seciniz: ");
                    select = scan.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Para miktari : ");
                            amount = scan.nextInt();
                            if (amount>balance) {
                                System.out.println("Bakiyeniz yetersiz!");
                            } else {
                                balance -= amount;
                            }
                            break;
                        
                        case 2:
                            System.out.print("Para miktari : ");
                            amount = scan.nextInt();
                            balance += amount;
                            break;
                            
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        
                        default:
                            break;
                    }
                } while (select != 4);
                    System.out.println("Tekrar gorusmek uzere!");
                    break;
            } else {
                right--;
                System.out.println("Hatali kullanici adi veya sifre! Luften tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabiniz bloke olmustur, Lutfen banka ile iletisime geciniz.");
                } else {
                    System.out.println("Kalan hakkiniz : " + right);
                }
            }
            scan.close();
        }
    }
}
