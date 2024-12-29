package fibonaccicalc;
import java.util.Scanner;
public class FibonacciCalc {
    static int num;
    public  static int fibo(int n){
        if(n<=1){
            return n;
        }
        else{
            return  fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter a number for your series: ");
        num=sc.nextInt();
        int ans=fibo(num);
        System.out.println("Your fibonacci series is: "+ans);
    }
}
