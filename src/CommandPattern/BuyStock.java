package CommandPattern;

/**
 * Each class stands for a specific operation in request class
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }
    @Override
    public void execute() {
        abcStock.buy();
    }
}
