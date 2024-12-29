package inheritance_2;

public class CurrentAccount extends Account{
    private String accType;
    public CurrentAccount(int accNo ,String accBranch,Member owner,double balance)
    {
        super(accNo,accBranch,owner,balance);
        this.accType="Current Account";
    }
    public void displayInfo()
    {
        System.out.println("___________________________________________");
        System.out.println("Account Type: "+accType);
        System.out.println("Account Number: "+getAccountNo());
        System.out.println("Account Branch: "+getAccountBranch());
        System.out.println("Account Balance: "+getAccountBalance());
        System.out.println("Account Owner's Name: "+getOwnerName());
        System.out.println("Account Owner's Email: "+getOwnerEmail());
        System.out.println("Account Owner's Contact: "+getOwnerContact());
      
    }
    
}
