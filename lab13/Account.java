package lab_13;

import java.util.*;
public class Account {
    private String name, accNo, pinCode;
    private double balance;
    Scanner sc = new Scanner(System.in);
    Account(String name, String accNo, String pinCode, double balance)
    {
        this.name=name;
        this.accNo=accNo;
        this.pinCode=pinCode;
        this.balance=balance;
    }
    //create account
    //delete account
    //search etc
    public void withdrawMoney()
    {
        try
        {
            System.out.print("Please enter the amount of money you want to withdraw: ");
            double wMoney =sc.nextDouble();
            if(wMoney<0 || wMoney>balance)
            {
                throw new IllegalArgumentException("Invalid input");
            }
            balance = balance - wMoney;
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Current Balance: "+balance);
        }     
    }
    public void depositMoney()
    {
        try
        {
            System.out.print("Please enter the amount of money you want to deposit: ");
            double bMoney =sc.nextDouble();
            if(bMoney<0)
            {
                throw new IllegalArgumentException("Invalid input");
            }
            balance = balance + bMoney;
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Current Balance: "+balance);
        }
        
    }
}
