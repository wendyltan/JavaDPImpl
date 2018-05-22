package FacadePattern;

/**
 * Wrapping up all draw function implemented by Shape's children.So user don't have to
 * know about the children classes' existence.(Only want to use the different draw function)
 */
public class ShapeFacade {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeFacade(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }


    public void drawSquare(){
        square.draw();
    }
}
