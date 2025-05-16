package Q4;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the year ");
        int year=scanner.nextInt();
        if((year%4==0)&&(year%100==0)){
            if(year%400==0){
                System.out.println("It is a leap year:");
            }
            else{
                System.out.println("It is not a leap year:");
            }
        } else if ((year%4==0)||(year%100==0)&&(year%400==0)) {
            System.out.println("It is a leap year:");
        }
        else{
            System.out.println("It is not a lepa year:");
        }
    }
}
