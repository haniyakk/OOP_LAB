package temperature;
import java.util.Scanner;
public class Temperature{
   double tempC, tempF;
    public static void main(String[] args) {
        Temperature obj = new Temperature();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input temperature in Celsius: ");
        obj.tempC=sc.nextDouble();
        obj.tempF=(obj.tempC*9/5)+32;
        System.out.println("Temperature in Fahrenheit  is: "+obj.tempF);
    }
}
