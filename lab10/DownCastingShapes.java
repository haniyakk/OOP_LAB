package lab10;
public class DownCastingShapes {
    public static void main(String[] args){
        
    Shape[] randomShapes = TestShapes.createShape();
    for(int i = 0; i < randomShapes.length; i++){
        System.out.println(randomShapes[i]);
        if(randomShapes[i] instanceof Circle)
            System.out.println("Radius= " +((Circle) randomShapes[i]).getRadius());
        else if(randomShapes[i] instanceof Square)
            System.out.println("Length= " +((Square) randomShapes[i]).getLength());
        else if(randomShapes[i] instanceof Rectangle)
            System.out.println("Length= " +
            ((Rectangle) randomShapes[i]).getLength()
            + "\nWidth= " +
            ((Rectangle) randomShapes[i]).getWidth());
        }
    }
}
