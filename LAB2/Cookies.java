package cookies;
import java.util.Scanner;

public class Cookies{
      int noOfCookies, noOfBoxes, noOfCarton, leftBoxes;
      double moneyMade; 
   public static void main(String[] args) {
        Cookies obj = new Cookies();
        Scanner sc = new Scanner(System.in); 
        System.out.print("Please enter the number of cookies: ");
        obj.noOfCookies = sc.nextInt();
        obj.noOfBoxes= obj.noOfCookies/12;
        obj.noOfCarton= obj.noOfBoxes/24;
        obj.leftBoxes=obj.noOfBoxes%24;
        obj.moneyMade = (obj.noOfBoxes - obj.leftBoxes) * 1.14 + obj.leftBoxes *0.57;
        System.out.println("Number of Cartons: "+obj.noOfCarton);
        System.out.println("Number of Boxes: "+obj.noOfBoxes);
        System.out.println("Number of Left over boxes: "+obj.leftBoxes);
        System.out.println("Total money made: "+obj.moneyMade); 
}
}

