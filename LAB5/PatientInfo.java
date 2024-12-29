package patientinfo;
import java.util.Scanner;
public class PatientInfo {
    static int  pAge;
    static double pBill;
    static String pName, pContact, pComplain, pNumber;
    public void Take_Patient_data(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------PATIENT'S INFO-------------");
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
        sc.nextLine();
        System.out.print("Enter patient's Number: ");
        pNumber = sc.nextLine();
    }
    public void Print_Receipt(){
        System.out.println("-------------PATIENT'S RECEIPT-------------");
        System.out.println("Patient's Name: "+pName);
        System.out.println("Patient's Age: "+pAge);
        System.out.println("Patient's Contact: "+pContact);
        System.out.println("Patient's Complain: "+pComplain);
        System.out.println("Patient's Bill: "+pBill);
        System.out.println("Patient's Number: "+pNumber);
    }
    public static void main(String[] args){
        PatientInfo p1=new PatientInfo();
        p1.Take_Patient_data();
        p1.Print_Receipt();
    }
}

