package lab10;
public class Rectangle  extends Shape{
    private double length;
    private double width;
    public Rectangle(double length, double width){
        this.width=width;
        this.length=length;
    }
    @Override
    public double area(){
        return length*width;
    }
    @Override
    public double perimeter() {
        return 2*(length+width);
    }
    public void display(){
    System.out.println("Rectangle");
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    
}
