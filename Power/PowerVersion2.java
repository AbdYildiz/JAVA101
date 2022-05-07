package JAVA101.Power;

import java.util.Scanner;

public class PowerVersion2 {
    public static void main(String[] args) {
        /**Java ile kullanıcının girdiği değerler ile üslü sayı 
         * hesaplayan programı "For Döngüsü" kullanarak yapınız. */
        Scanner scan = new Scanner(System.in);
        System.out.print("Ussu alinacak olan sayiyi giriniz: ");
        int num = scan.nextInt();
        System.out.print("Ussu giriniz: ");
        int power = scan.nextInt();
        
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *=num;
        }
        System.out.println(num + " ^ "+ power + " = " +result);

        scan.close();
    }
}
