import java.util.*;
import java.util.Scanner;

class Currency_Conversion {
    public static void main (String [] args) {

        System.out.println("1 - INR");
        System.out.println("2 - DOLLAR $");
        System.out.println("3 - EURO");

        Scanner sc = new Scanner (System.in);
        System.out.println("Please choose the currency");
        int value = sc.nextInt();

        System.out.println("Enter the amount");
        double amount = sc.nextDouble();

        switch (value) {
            case 1 :
            inr_to_other(amount);
            break;

            case 2 :
            dollar_to_other(amount);
            break;

            case 3 :
            euro_to_other(amount);
            break;
        }
        
    }
public static void inr_to_other (double amt) {
    System.out.println("1 INR = " + 0.013 + " DOLLAR $");
    System.out.println();

    System.out.println(amt+" INR = " + (amt*0.013) + " DOLLAR $");
    System.out.println();

    System.out.println("1 INR = " + 0.012 + " EURO");
    System.out.println();
    System.out.println(amt+" INR = " + (amt*0.012) + " EURO");
    System.out.println();   
}

public static void dollar_to_other(double amt) {
    System.out.println("1 DOLLAR $ = " + 79.37 + " INR");
    System.out.println();
    System.out.println(amt+" DOLLAR $ = " + (amt*79.37) + " INR");
    System.out.println();

    System.out.println("1 DOLLAR $= " + 0.98 + " EURO");
    System.out.println();

    System.out.println(amt+" DOLLAR $ = " + (amt*0.98) + " EURO");
}

    

public static void euro_to_other(double amt){
    System.out.println("1 EURO = " + 80.85 + " INR");
    System.out.println();
    System.out.println(amt+" EURO = " + (amt*80.85) + " INR");
    System.out.println();

    System.out.println("1 EURO = " + 1.02 + " DOLLAR $");
    System.out.println();

    System.out.println(amt+" EURO = " + (amt*1.02) + " DOLLAR $");
}

}