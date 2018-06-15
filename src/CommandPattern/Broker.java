package CommandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Use this class to invoke all commands by
 * different kinds of command class.I call this
 * a 'Invoker'
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order:orderList){
            order.execute();
        }
        //clear all commands after one run.
        orderList.clear();
    }
}
