package JAVA101.RecursiveFibonnacci;

public class Recursive {
    public static void main(String[] args) {
        /**Java'da recursive metotlar ile fibonacci serisi bulan program yapıyoruz. */
        int basamak = 9;
        for (int i = 1; i < basamak; i++) {
            System.out.println(Fibonacci(i));
        }       
    }

    static int Fibonacci(int n){
        if (n == 1 || n==2) {
            return 1;
        } else {
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
        
    }
}
