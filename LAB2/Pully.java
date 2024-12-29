
package pully;
import java.util.Scanner;
public class Pully {
    double rpm1,dia1,dia2,force,ropes, rpm2, weightLifted;
    public static void main(String[] args) {
        Pully obj = new Pully();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input rpm1: ");
        obj.rpm1= sc.nextDouble();
        System.out.print("Input diameter 1 : ");
        obj.dia1= sc.nextDouble();
        System.out.print("Input diameter 2 : ");
        obj.dia2= sc.nextDouble();
        System.out.print("Input force: ");
        obj.force= sc.nextDouble();
        System.out.print("Input number of up ropes: ");
        obj.ropes= sc.nextDouble();
        obj.rpm2=obj.dia1/obj.dia2*obj.rpm1;
        System.out.println("RPM2 = "+obj.rpm2);
        
        obj.weightLifted=obj.force*obj.ropes;
        System.out.println("Weight lifted =  "+obj.weightLifted);
    }
    
}
