package JAVA101.Asal;

import javax.lang.model.util.ElementScanner6;

public class Asal {
    public static void main(String[] args) {
        /**Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız. */

        int temp;
        for (int i = 1; i < 100; i++) {
            temp = 2;
            while (temp <= i) {
                if (i % temp == 0 && i == temp) {
                    System.out.print(i + " ");
                    break;
                } else if (i % temp == 0) {
                    break;
                } else{
                    temp++;
                }
            } 
        }
    }
}
