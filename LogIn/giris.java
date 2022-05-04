package JAVA101.LogIn;

import java.util.Scanner;

public class giris {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp
         * sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak
         * isterse yeni girdiği şifrenin hatalı girdiği ve 
         * unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , 
         * şifreler aynı ise ekrana 
         * "Şifre oluşturulamadı, lütfen başka şifre giriniz." 
         * sorun yoksa "Şifre oluşturuldu" yazan programı yazınız. */
        System.out.print("Kullanici adini giriniz : ");
        String name = scan.nextLine();
        System.out.print("Sifrenizi giriniz : ");
        String password = scan.nextLine();
        String DefaultPassword = "jghlemni";

        if (!(password.equals(DefaultPassword))) {
            System.out.print("Sifreniz hatali, sifrenizi sifirlamak isterseniz 1 yazin : ");
            String tmp = scan.nextLine();
            if (tmp.equals("1")){
                String newPassword = scan.nextLine();
                if (newPassword.equals(DefaultPassword))
                    System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz.");
                else
                    DefaultPassword=newPassword; System.out.println("Sifre olusturuldu");
            }
        } 
        System.out.println(DefaultPassword);
        
        scan.close();
    }
}
