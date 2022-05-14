package JAVA101.Palindrom;

public class Palindrom {
    public static void main(String[] args) {    
        /**Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır. */
        System.out.println(isPalindrom(987));
        System.out.println(isPalindrom(282));
    }

    static boolean isPalindrom(int a){
        int num = a, reversed = 0, last;

        while (num != 0 ) {
            last = num % 10;
            reversed = (reversed * 10) + last;
            num /= 10;
        }
        
        if (reversed == a) {
            return true;
        } else {
            return false;
        }
    }
}