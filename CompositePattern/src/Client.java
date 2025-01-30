import java.util.ArrayList;
import java.util.List;


public class Client {
    public static void main(String[] args) {
        // Create individual Circle objects
        Circle circle1 = new Circle(5, 10, 15);
        Circle circle2 = new Circle(7, 20, 25);
        Circle circle3 = new Circle(3, 30, 35);

        // Create a composite graphic object and add Circle objects to it
        CompositeGraphic composite = new CompositeGraphic();
        composite.add(circle1);
        composite.add(circle2);

        // Create another composite and add some graphics
        CompositeGraphic composite2 = new CompositeGraphic();
        composite2.add(circle3);
        composite2.add(composite); // Adding previous composite to the new composite

        // Draw all graphics
        composite2.draw();
    }
}






