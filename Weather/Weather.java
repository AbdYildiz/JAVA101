package JAVA101.Weather;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        /**Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
           Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
           Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
           Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Sicaklik kac derece: ");
        int sicaklik = scan.nextInt();
    
        String tmp1 = (sicaklik<5) ? "Kayak yapabilirsiniz ":"";
        String tmp2 = (sicaklik<15 && sicaklik >5) ? "Sinemaya gidebilirsiniz ":"";
        String tmp3 = (sicaklik<25 && sicaklik >15) ? "Piknik yapabilirsiniz ":"";
        String tmp4 = (sicaklik>25) ? "Yuzmeye gidebilirsiniz ":"";


        System.out.println(tmp1+tmp2+tmp3+tmp4);
        scan.close();
    }
}
