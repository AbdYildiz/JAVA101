import java.util.Scanner;

class Hipotenus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dik kenar uzunluklarini giriniz: ");
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        double c = Math.pow(a, 2) + Math.pow(b, 2);
        double d = Math.sqrt(c);

        System.out.println("Hipotenus'un uzunlugu = " + d);
        scan.close();
    }    
}
