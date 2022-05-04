package JAVA101.Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Yapacak oldugunuz islemi (a + b) formatinda yaziniz : ");

        String[] process = scan.nextLine().split(" ");
        
        switch (process[1]) {
            case "+":
                System.out.println(Integer.valueOf(process[0]) + Integer.valueOf(process[2]));
                break;
            case "-":
                System.out.println(Integer.valueOf(process[0]) - Integer.valueOf(process[2]));
                break;
            case "*":
                System.out.println(Integer.valueOf(process[0]) * Integer.valueOf(process[2]));
                break;
            case "/":
                System.out.println(Integer.valueOf(process[0]) / Integer.valueOf(process[2]));
                break;
            
            default:
                break;
        }
        scan.close();

    }
}
