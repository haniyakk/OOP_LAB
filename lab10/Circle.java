
package lab10;

public class Circle extends Ellipse{
    private double radius;
    public Circle(double radius){
        super(radius,radius);
    }
    public double getRadius(){
        return radius;
    }
}