package JAVA101.Armstrong;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        /**N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, 
         * sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
        Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. 
        Bu da 407 sayısının armstrong bir sayı olduğunu gösterir. */
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Armstrong sayisi giriniz: ");
        
        int arm = scan.nextInt();
        int basamak = arm;
        final int real = arm;
        double total = 0;
        int len = 0;
        
        while (basamak !=0) {
            basamak = basamak / 10;
            len++;
        }

        while (arm != 0) {
            total = (total + Math.pow(arm % 10, len)); // Her bir basamagin sayinin uzunlugunca kuvveti alinip toplanir
            arm = arm /10;
        }

        if (real == total) {
            System.out.println(real + " sayisi bir Armstrong sayisidir.");
        } else {
            System.out.println(real + " sayisi bir Armstrong sayisi degildir.");
        }

        scan.close();
    }
    
}