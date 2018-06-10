package FlyweightPattern;

import java.util.HashMap;

/**
 * Storing a hashmap of Circle objects.If exists,take and return;
 * else, create new and add to the map then return.
 */
public class ShapeFactory {
    private static final HashMap<String,Shape> circleMap =
            new HashMap<>();

    public static Shape getCircle(String color){
        Circle circle = (Circle) circleMap.get(color);
        if (circle==null){
            //create one new object and add to map
            circle = new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
