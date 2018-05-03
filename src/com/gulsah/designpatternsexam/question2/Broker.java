package com.gulsah.designpatternsexam.question2;

import com.gulsah.designpatternsexam.question2.command.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GulsahCoskun on 1.05.2018.
 */
public class Broker {

    private List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order){
        orders.add(order);
    }

    public void placeOrders(){
        for(Order order :  orders){
            order.execute();
        }
        orders.clear();
    }
}
