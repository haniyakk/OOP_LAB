package lab11;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandling {
    Scanner sc = new Scanner(System.in);
    public void writeFile()
    {
        String fileName =  "EmployeeInfo.txt";
        PrintWriter outputStream = null;
        try
        {
            outputStream = new PrintWriter(fileName);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error opening the file "+ fileName);
            System.exit(0);
        }
        System.out.print("Enter Employee name: ");
        String name =  sc.nextLine();
        System.out.print("Enter Employee department: ");
        String dept =  sc.nextLine();
        System.out.print("Enter Employee contact: ");
        String contact =  sc.nextLine();
        System.out.print("Enter Employee designation: ");
        String desig =  sc.nextLine();
        System.out.print("Enter Employee salary: ");
        int salary =  sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee status: ");
        String status =  sc.nextLine();
        outputStream.println(name);
        outputStream.println(dept);
        outputStream.println(contact);
        outputStream.println(desig);
        outputStream.println(salary);
        outputStream.println(status);
        outputStream.close();
        System.out.println("Employee details have been written to the file "+fileName);
    }
    public static void updateFile(String inputFileName, String outputFileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             PrintWriter writer = new PrintWriter(new FileWriter(outputFileName));
             Scanner sc = new Scanner(System.in)) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Current value for Name: " + line);
                System.out.print("Enter new Name: ");
                String name = sc.nextLine();
                writer.println(name);

                System.out.println("Current value for Dept: " + reader.readLine());
                System.out.print("Enter new Dept: ");
                String dept = sc.nextLine();
                writer.println(dept);
                
                System.out.println("Current value for Contact: " + reader.readLine());
                System.out.print("Enter new Contact: ");
                String contact = sc.nextLine();
                writer.println(contact);

                System.out.println("Current value for Designation: " + reader.readLine());
                System.out.print("Enter new Designation: ");
                String desig = sc.nextLine();
                writer.println(desig);
                
                System.out.println("Current value for Salary: " + reader.readLine());
                System.out.print("Enter new Salary: ");
                String salary = sc.nextLine();
                writer.println(salary);

                System.out.println("Current value for Status: " + reader.readLine());
                System.out.print("Enter new Status: ");
                String status = sc.nextLine();
                writer.println(status);

                System.out.println("Record updated successfully!\n");
            }

        } catch (IOException e) {
            System.out.println("An error occurred while processing the file: " + e.getMessage());
        }
    }
}
