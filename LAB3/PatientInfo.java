package patientinfo;
import java.util.Scanner;

public class PatientInfo {
    static int  pAge;
    static double pBill;
    static String pName, pContact, pComplain, pNumber;
    public static void Take_Patient_data(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter patient's Name: ");
        pName = sc.nextLine();
        
        System.out.print("Enter patient's Age: ");
        pAge = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter patient's Contact: ");
        pContact = sc.nextLine();
        
        System.out.print("Enter patient's Complain: ");
        pComplain = sc.nextLine();
        
        System.out.print("Enter patient's Bill: ");
        pBill = sc.nextDouble();
        
        System.out.print("Enter patient's Number: ");
        pName = sc.nextLine();
    }
    public static void Print_Receipt(){
        System.out.println(pName+"Patient's Name: ");
        System.out.println("Patient's Age: "+pAge);
        System.out.println(pNumber+"Patient's Number: ");
        System.out.println(pComplain+"Patient's Complain: ");
        System.out.println(pContact+"Patient's Contact: ");
        System.out.println(pBill+"Patient's Bill: ");
    }
    public static void main(String[] args){
        System.out.println("-------------PATIENT'S INFO-------------");
        Take_Patient_data();
        System.out.println("-------------PATIENT'S RECEIPT-------------");
        Print_Receipt();
    }
}

