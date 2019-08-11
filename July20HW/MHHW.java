package July20HW;

import java.util.Scanner;

public class MHHW {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter Celsius degree: ");
        double getCelsius = sc.nextInt();
        System.out.print("Fahrenheit degree: " + changeToFahrenheit(getCelsius));
    }
    public static double changeToFahrenheit(double getCelsius) {
        double output = 0;
        output = output + getCelsius * 1.8 + 32;
        return output;
    }
}
