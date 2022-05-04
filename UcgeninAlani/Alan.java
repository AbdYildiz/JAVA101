package JAVA101.UcgeninAlani;

import java.util.Scanner;

class Alan{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarini sirasi ile giriniz: ");
        /**
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
         */
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        int u = (a+b+c)/2; //cevrenin yarisi
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        
        System.out.println("Ucgenin alani = "+ alan);
        scan.close();
    }
}