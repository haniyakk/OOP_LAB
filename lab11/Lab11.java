package lab11;
import java.util.Scanner;
import java.io.*;
public class Lab11 {
    public static void main(String[] args) {
        FileHandling obj = new FileHandling();
        obj.writeFile();
        System.out.println("Do you want to update your file (yes/no): ");
        Scanner sc = new Scanner(System.in);
        String decision = sc.nextLine();
        if(decision.equalsIgnoreCase("yes"))
        {
            obj.updateFile("EmployeeInfo.txt","UpdatedEmployeeInfo.txt");
        }   
        }
        

}
