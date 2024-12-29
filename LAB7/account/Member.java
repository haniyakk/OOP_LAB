package inheritance_2;

public class Member {
    private String memName, memEmail,memCont;
    public Member(String memName,String memEmail,String memCont )
    {
        this.memName=memName;
        this.memEmail=memEmail;
        this.memCont=memCont;
    
    }
    public String getMemName(){return memName;}
    public String getMemEmail(){return memEmail;}
    public String getMemCont(){return memCont;}
    
}
