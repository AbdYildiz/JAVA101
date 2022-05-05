package JAVA101.Sort;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        /**
         * Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız. 
         * */
        Scanner scan = new Scanner(System.in);
        System.out.println("3 adet sayi giriniz: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a>b && a>c) {
            if (b>c) {
                System.out.println(a + ">" + b + ">" + c );
            }else{
                System.out.println(a + ">" + c + ">" + b );
            }
        } else if (b>a && b>c){
            if (a>c) {
                System.out.println(b + ">" + a + ">" + c );
            }else{
                System.out.println(b + ">" + c + ">" + a );
            }
        }else{
            if (b>a) {
                System.out.println(c + ">" + b + ">" + a );
            }else{
                System.out.println(c + ">" + a + ">" + b );
            }
        }        


        scan.close();
    }
}
