
package lab10;

public abstract class Shape {
    public String name(){
        return getClass().getSimpleName();
    }
    public abstract double area();
    public abstract double perimeter();
    @Override
    public  String toString(){
        return "\n" + name() + "\nArea= " +area() + "\nPerimeter=  " +perimeter();
    }

    
}
