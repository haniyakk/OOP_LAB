package equation;
public class Equation{
    int x= 6,y= 20,z=13;
    int ans1= 2*(x*x)+y*y;
    int ans2= 3*x+y-3*(z*z);
    int ans3 = 2*x-2*y+5*(z*z);
    
    public static void main(String[] args) {
        Equation obj = new Equation();
        System.out.println("2*(x*x)+y*y = "+obj.ans1);
        System.out.println("3*x+y-3*(z*z) = "+ obj.ans2);
        System.out.println("2*x-2*y+5*(z*z) = "+obj.ans3);
    }
}

