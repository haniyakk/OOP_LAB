package lab10;
public class Ellipse extends Shape implements Eccentric{
    double a,b;
    Ellipse(double s1, double s2){
        if(s1<s2){
            a=s2;
            b=s1;
        }
        else{
            a=s1;
            b=s2;
        }
    }
    @Override
    public double area() {
        return Math.PI*a*b;
    }
    @Override
    public double perimeter() {
        return Math.PI*(Math.sqrt(2*((a*a)+(b*b))-(((a*a)-(b*b)))/2));
    }
    @Override
    public double eccentricity() {
        return Math.sqrt(1-((b*b)/(a*a))); 
    }
    @Override
    public String toString(){
        return super.toString() +"\n"+"Eccentricity:"+eccentricity();
    }
    
}
