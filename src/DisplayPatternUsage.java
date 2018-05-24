import AdapterPattern.AudioPlayer;
import BridgePattern.Circle;
import BridgePattern.GreenCircle;
import BridgePattern.RedCircle;
import BridgePattern.Shape;
import BuilderPattern.File;
import FacadePattern.ShapeFacade;
import FactoryPattern.ShapeFactory;
import StrategyPattern.Context;
import StrategyPattern.OperationAdd;
import StrategyPattern.OperationMultiply;
import StrategyPattern.OperationSubstract;

public class DisplayPatternUsage {
    public static void main(String[] args){

        divideHeaderOutput("Usage of facade pattern implementation");
        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.drawCircle();
        shapeFacade.drawRectangle();
        shapeFacade.drawSquare();

        divideHeaderOutput("Usage of adapter pattern implementation");
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","Something just like this.mp3");
        audioPlayer.play("vlc","far far away.vlc");
        audioPlayer.play("mp4","Aili.mp4");
        audioPlayer.play("rmvb","Sword art online.rmvb");

        divideHeaderOutput("Usage of strategy pattern implementation");
        Context context = new Context(new OperationAdd());
        System.out.println("10+5 = "+ context.executeStrategy(10,5));
        context = new Context(new OperationSubstract());
        System.out.println("10-5 = "+context.executeStrategy(10,5));
        context = new Context(new OperationMultiply());
        System.out.println("10*5 = "+context.executeStrategy(10,5));

        divideHeaderOutput("Usage of bridge pattern implementation");
        Shape redCircle = new Circle(100,100,10,new RedCircle());
        Shape greenCircle = new Circle(100,100,10,new GreenCircle());
        redCircle.draw();
        greenCircle.draw();

        divideHeaderOutput("Usage of factory pattern implementation");
        ShapeFactory shapeFactory = new ShapeFactory();
        FactoryPattern.Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        FactoryPattern.Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        FactoryPattern.Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

        divideHeaderOutput("Usage of builder pattern implementation");
        File file1 = new File.Builder("hello",120,"C://").fileEdit("yesterday").build();
        System.out.println(file1.getAllInfo());
        File file2 = new File.Builder("goodbye",999,"D://asd")
                .fileEdit("today")
                .fileHash("213213")
                .build();
        System.out.println(file2.getAllInfo());
        File file3 = new File.Builder("sayonara",11111,"F://")
                .fileEdit("two weeks ago")
                .fileHash("12312313")
                .fileType("exe")
                .build();
        System.out.println(file3.getAllInfo());


    }

    public static void divideHeaderOutput(String info){
        System.out.println(String.format("------------------%s-----------------",info));
    }
}
