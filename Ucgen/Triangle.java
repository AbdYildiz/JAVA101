package JAVA101.Ucgen;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        /**Java ile basamak sayısının kullanıcıdan alınan ve 
         * döngüler kullanılarak, yıldızlar(*) ile ekrana ters 
         * ücgen çizen programı yazın. */
        Scanner scan = new Scanner(System.in);
        System.out.print("Basamak sayisi : ");
        int basamak = scan.nextInt();
        int count = basamak * 2 - 1;
        int space = 0;
        
        for (int i = basamak; i > 0 ; i--) {
            for (int j = 0; j < space ; j++) {
                System.out.print(" ");
            }
            for (int j = count; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
            count -=2;
            space ++;
        }

        scan.close();
    }
}
