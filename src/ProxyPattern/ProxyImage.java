package ProxyPattern;

/**
 * The proxy class.Implements the same interface but add additional
 * operation.Client can only use this object to avoid direct access to realSubject.
 */
public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage==null){
            realImage = new RealImage(fileName);
        }
        preDisplay();
        realImage.display();
        postDisplay();
    }

    private void preDisplay(){
        System.out.println("Doing something before display");
    }

    private void postDisplay(){
        System.out.println("Doing something after display");
    }
}
