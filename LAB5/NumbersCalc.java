package numberscalc;
import java.util.Scanner;

public class NumbersCalc {
    static int time,count;
    public static int sumCallOdd(){
        int res=0;
        for(int i=0;i<time;i++){
            if(i%2!=0){
            res+=i;
            }
        }
        return res;
    }
    public static int sumCallEven(){
        int res=0;
        for(int i=0;i<time;i++){
            if(i%2==0){
            res+=i;
            }
        }
        return res;
    }
    public static int sumCallPrime(){
     int res = 0;
        for (int i = 2; i <= time; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                res += i;
            }
        }
       return res;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter duration of your workout in minutes: ");
        time = sc.nextInt();
        int ans1=sumCallOdd();
        System.out.println("Calories burned up to "+time+" for odd are: "+ans1);
        int ans2=sumCallEven();
        System.out.println("Calories burned up to "+time+" for even are: "+ans2);
        int ans3=sumCallPrime();
        System.out.println("Calories burned up to "+time+" for even are: "+ans3);
        
    }
    
}
