package lab_13;
import java.util.Scanner;
public class Lab_13 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        Account acc1 = new Account("name","no","pincode",1000);
        System.out.println("What do you want to do? ");
        System.out.println("1- Withdraw Money\n2- Deposit Money");
        System.out.print("Please enter your choice: ");
        int menu = sc.nextInt();
        switch(menu)
        {
            case 1:
                acc1.withdrawMoney();
                break;
            case 2:
                acc1.depositMoney();
                break;
            default:
                System.out.println("Please enter valid input.");
        }
    }
    
}
