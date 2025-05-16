package Q2;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number between (0-4)");
        int number = input.nextInt();
        String color;
        switch(number) {
            case 0:
                color = "magenta";
                break;
            case 1:
                color = "Cyan";
                break;
            case 2:
                color = "Red";
                break;
            case 3:
                color = "Blue";
                break;
            case 4:
                color = "Green";
                break;
            default:
                color = null;
                break;
        }
        if(color==null){
            System.out.println("Invalid selection ");
        }else
            System.out.println("you selected "+ color);
    }
}

