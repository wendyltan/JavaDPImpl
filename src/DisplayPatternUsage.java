import DecoratorPattern.Beverage;
import DecoratorPattern.Coffee;
import DecoratorPattern.Honey;
import DecoratorPattern.Milk;
import FactoryRelatedPatterns.AbstractFactory.AbstFactory;
import FactoryRelatedPatterns.AbstractFactory.Color;
import FactoryRelatedPatterns.AbstractFactory.FactoryProducer;
import AdapterPattern.AudioPlayer;
import BridgePattern.Circle;
import BridgePattern.GreenCircle;
import BridgePattern.RedCircle;
import BridgePattern.Shape;
import BuilderPattern.File;
import FacadePattern.ShapeFacade;
import FactoryRelatedPatterns.FactoryMethod.NYPizzaStore;
import FactoryRelatedPatterns.FactoryMethod.Pizza;
import FactoryRelatedPatterns.FactoryMethod.PizzaStore;
import FactoryRelatedPatterns.FactoryPattern.ShapeFactory;
import ObserverPattern.BinaryObserver;
import ObserverPattern.OctalObserver;
import ObserverPattern.Subject;
import SingletonPattern.SingleObject;
import StatePattern.StartState;
import StatePattern.StopState;
import StrategyPattern.Context;
import StrategyPattern.OperationAdd;
import StrategyPattern.OperationMultiply;
import StrategyPattern.OperationSubstract;
import TemplatePattern.Cricket;
import TemplatePattern.Football;
import TemplatePattern.Game;

public class DisplayPatternUsage {
    private static final String colors[] =
            { "Red", "Green", "Blue", "White", "Black" };

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
        FactoryRelatedPatterns.FactoryPattern.Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        FactoryRelatedPatterns.FactoryPattern.Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        FactoryRelatedPatterns.FactoryPattern.Shape shape3 = shapeFactory.getShape("SQUARE");
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

        divideHeaderOutput("Usage of abstract factory implementation");
        AbstFactory factory= FactoryProducer.getFactory("SHAPE");

        FactoryRelatedPatterns.AbstractFactory.Shape ashape1 = factory.getShape("CIRCLE");
        ashape1.draw();

        FactoryRelatedPatterns.AbstractFactory.Shape ashape2 = factory.getShape("RECTANGLE");
        ashape2.draw();

        FactoryRelatedPatterns.AbstractFactory.Shape ashape3 = factory.getShape("SQUARE");
        ashape3.draw();

        AbstFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color color1 = colorFactory.getColor("RED");
        color1.fill();

        Color color2 = colorFactory.getColor("Green");
        color2.fill();

        Color color3 = colorFactory.getColor("BLUE");
        color3.fill();

        divideHeaderOutput("Usage of factory method implementation");
        //Notice that here can be more factory patterns!Like wrapping in Abstract factory.
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza1 = pizzaStore.orderPizza("CHEESE");
        Pizza pizza2 = pizzaStore.orderPizza("PEPPERONI");
        Pizza pizza3 = pizzaStore.orderPizza("GREEK");

        divideHeaderOutput("Usage of observer pattern implementation");
        Subject subject = new Subject();
        //Already bind and register!
        new BinaryObserver(subject);
        new OctalObserver(subject);
        //Now subject has two observers,when state change,
        //subject will notify all obsevers and tell them to do their jobs
        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);


        divideHeaderOutput("Usage of singleton pattern implementation");
        SingleObject object = SingleObject.getInstance();
        object.showMessage();

        divideHeaderOutput("Usage of decorator pattern implementation");
        Beverage coffee = new Coffee();
        Beverage honey = new Honey(coffee);
        Beverage milk = new Milk(honey);
        milk.cook();

        divideHeaderOutput("Usage of state pattern implementation");
        StatePattern.Context stateMachine = new  StatePattern.Context();
        StartState startState = new StartState();
        startState.doAction(stateMachine);
        System.out.println(stateMachine.getState().toString());
        StopState stopState = new StopState();
        stopState.doAction(stateMachine);
        System.out.println(stateMachine.getState().toString());


        divideHeaderOutput("Usage of template pattern implementation");
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();

        divideHeaderOutput("Usage of flyweight pattern implementation");

        for(int i=0; i < 20; ++i) {
            FlyweightPattern.Circle circle =
                    (FlyweightPattern.Circle) FlyweightPattern.ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }


    }

    public static void divideHeaderOutput(String info){
        System.out.println(String.format("------------------%s-----------------",info));
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }

}
