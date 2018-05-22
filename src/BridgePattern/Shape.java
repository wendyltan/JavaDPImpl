package BridgePattern;

/**
 * Contains our interface and let the child of this class
 * implements the draw method.
 */
public abstract class Shape {
    protected DrawApi drawApi;
    protected Shape(DrawApi drawApi){
        this.drawApi = drawApi;
    }
    public abstract void draw();
}
