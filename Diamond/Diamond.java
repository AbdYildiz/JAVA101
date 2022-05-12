package JAVA101.Diamond;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        /**Java'da döngüler kullanarak yıldızlar ile elmas yapınız. */
        Scanner scan = new Scanner(System.in);
        System.out.print("Elmas boyutunu girin: ");
        int size = scan.nextInt();
        int space = size/2;
        
        for (int i = 1; i <= size; i+=2) {
            space--;
            for (int j = 0; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }            
            System.out.println();
        }

        space++;
        for (int i = size-2; i >= 1; i-=2) {
            space++;
            for (int j = space-1; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        scan.close();
    }
}
