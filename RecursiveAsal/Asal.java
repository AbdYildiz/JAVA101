package JAVA101.RecursiveAsal;

import java.util.Scanner;

public class Asal {
    public static void main(String[] args) {
        /**Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan
         *  sayının "Asal" sayı olup olmadığını bulan programı yazın. */
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int x = scan.nextInt();
        for (int i = 2; i <= x; i++) {   // girilen sayiya kadar asal ve asal olmayanlari gosteren program
            boolean result = asal(i,2);
            
            if (result) {
                System.out.println(i + " sayisi asaldir ");
            } else {
                System.out.println(i + " sayisi asal degildir ");
            }
        }
        scan.close();
    }

    private static boolean asal(int x, int y) {
        if (x == y) {
            return true;
        } else if (x % y == 0){
            return false;
        } else {
            return asal(x, y+1);
        }
    }
}
