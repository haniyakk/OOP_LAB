
package inheritance_2;

public class Account {
    private int accNo;
    private String accBranch;
    private double balance;
    private Member owner;
    Account(int accNo ,String accBranch,Member owner,double balance)
    {
        this.accNo=accNo;
        this.accBranch=accBranch;
        this.owner=owner;
        this.balance=balance;
    }
    public String getOwnerName(){return owner.getMemName();}
    public String getOwnerEmail(){return owner.getMemEmail();}
    public String getOwnerContact(){return owner.getMemCont();}
    public String getAccountBranch(){return accBranch;}
    public int getAccountNo(){return accNo;}
    public double getAccountBalance(){return balance;}
    
}
//balance
//member