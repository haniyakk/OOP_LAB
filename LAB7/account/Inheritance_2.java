package inheritance_2;
public class Inheritance_2 {
    public static void main(String[] args) {
        Member m1= new Member("HANIYA KHAN","haniyakhan123@gmail.com","0302-2423423");
        Member m2= new Member("LAIMA TARIQ","laimatariq@gmail.com","0302-2457568");
        Member m3= new Member("ZAIN AHMED","ahmedzain@gmail.com","0322-34235253");
        CurrentAccount cA1= new CurrentAccount(01,"Main Branch",m1,100000);
        SavingAccount sA1 = new SavingAccount(02,"Main Branch",m2,100000);
        SavingAccount sA2 = new SavingAccount(03,"Main Branch",m3,100000);
        cA1.displayInfo();
        sA1.displayInfo();
        sA2.displayInfo();
    }
    
}
