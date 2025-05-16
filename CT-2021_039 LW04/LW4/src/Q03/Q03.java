package Q03;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        System.out.println("6 Million ");
        System.out.println("9 Billion ");
        System.out.println("12 Trillion");
        System.out.println("15 Quadrillion");
        System.out.println("18 Quintillion");
        System.out.println("21 Sextillion ");
        System.out.println("30 Nonillion ");
        System.out.println("100 Googol");

        Scanner scanner =new Scanner(System.in);
        System.out.println("input the 10th power");
        int power=scanner.nextInt();
        String message = new String();
        switch(power){
            case 6:
                message="Million";
                break;
            case 9:
                message="Billion";
                break;
            case 12:
                message="Trillion";
                break;
            case 15:
                message="Quadrillion";
                break;
            case 18:
                message="Quintillion";
                break;
            case 21:
                message="Sextillion";
                break;
            case 30:
                message="Nonillion";
                break;
        }
        if(message==null){
            System.out.println("Invalid input");
        }
        else{
            System.out.println("Your selection "+ message);
        }
        }
    }

