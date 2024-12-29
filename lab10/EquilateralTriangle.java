package lab10;
public class EquilateralTriangle extends Shape{
    private double side;
    EquilateralTriangle(double side){
        this.side=side;
    }
    @Override
    public double area() {
        return (1/4)*Math.sqrt(3)*(side*side);
    }
    @Override
    public double perimeter() {
        return 3*side;
    }
    
}
