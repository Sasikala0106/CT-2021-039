package Q3;

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the radius inner circle:");
        double innerRadius=scan.nextDouble();

        System.out.println("Enter the radius outer circle:");
        double outerRadius=scan.nextDouble();

        Circle outerCircle=new Circle(outerRadius);
        Circle innerCircle=new Circle(innerRadius);

        double area=outerCircle.computeArea()-innerCircle.computeArea();
        System.out.println("The area is"+area);
    }
}
