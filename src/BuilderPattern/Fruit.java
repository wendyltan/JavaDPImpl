package BuilderPattern;

/**
 * A simpler version of implementing builder pattern
 */
public class Fruit {
    private final String name;
    private final double price;
    private final String type;

    public Fruit(FruitBuilder builder){
        this.name = builder.name;
        this.price = builder.price;
        this.type = builder.type;
    }

    public static class FruitBuilder{
        private String name;
        private double price;
        private String type;

        public FruitBuilder(String name){
            this.name = name;
        }

        public FruitBuilder setPrice(double price){
            this.price = price;
            return this;
        }

        public FruitBuilder setType(String type){
            this.type = type;
            return this;
        }

        public Fruit build(){
            return new Fruit(this);
        }




    }
}
