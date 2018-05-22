package BridgePattern;

/**
 * Implementing the draw method using self-member interface's method.
 * By passing in different realization of drawApi,easily draw all kinds of colors of circle
 * Ignoring how the drawApi is implemented.The Circle class is decouped from drawApis but capable to
 * use its' service.
 */
public class Circle extends Shape {
    private int x,y,radius;
    public Circle(int radius, int x, int y, DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius,x,y);
    }
}
