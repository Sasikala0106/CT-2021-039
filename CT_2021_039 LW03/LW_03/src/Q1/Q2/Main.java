package Q1.Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Q1

        System.out.println("Enter the celsius value: ");
        double celsius = input.nextDouble();

        Q1.Q2.Temperature t1 = new Q1.Q2.Temperature();
        t1.setCelsius(celsius);

        System.out.println("The celsius is converted into fahrenhiet: " + t1.toFahrenhiet());

        //Q2

        System.out.println("Enter the fahrenhiet value: ");
        double fahrenhiet=input.nextDouble();

        Q1.Q2.Temperature t2 = new Q1.Q2.Temperature();
        t2.setFahrenhiet(fahrenhiet);

        System.out.println("The fahrenhiet is converted into celsius :" +t2.toCelsius());

    }
}

