package JAVA101.EBOB;

import java.util.Scanner;

public class En {
    public static void main(String[] args) {
        /**Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız. 
         * EKOK = (n1*n2) / EBOB
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("n1 sayisini giriniz : ");
        int n1 = scan.nextInt();
        System.out.print("n2 sayisini giriniz : ");
        int n2 = scan.nextInt();
        int div = 2;
        int ebob = 1;

        int ekok = 1;
        int n3 = n1;
        int n4 = n2;

        while (n1 != div && n2 != div) {
            if (n1%div==0 && n2%div==0) {
                ebob *= div;
                n1 /= div; 
                n2 /= div;
            } else {
                div++;
            }
        }
        System.out.println("EBOB : " + ebob);
        div=2;

        while (n3 >= div || n4 >= div) {
            if (n3%div==0 && n4%div==0) {
                ekok *= div;
                n3 /= div;
                n4 /= div;
            } else if (n3%div==0){
                ekok *= div;
                n3 /= div;
            } else if (n4%div==0){
                ekok *= div;
                n4 /= div;
            }else {
                div++;
            }
        }

        System.out.println("EKOK : " + ekok);
        scan.close();
    }
}
