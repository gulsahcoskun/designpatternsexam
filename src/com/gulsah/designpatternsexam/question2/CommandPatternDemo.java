package com.gulsah.designpatternsexam.question2;

import com.gulsah.designpatternsexam.question2.command.BuyStock;
import com.gulsah.designpatternsexam.question2.command.SellStock;

/**
 * Created by GulsahCoskun on 1.05.2018.
 */
public class CommandPatternDemo {

    public static void main(String[] args) {
        System.out.println("--Stock Management System--");
        Stock stock = new Stock();

        Broker broker = new Broker();
        broker.takeOrder(new SellStock(stock));
        broker.takeOrder(new BuyStock(stock));
        broker.takeOrder(new SellStock(stock));
        broker.takeOrder(new SellStock(stock));
        broker.takeOrder(new BuyStock(stock));
        broker.takeOrder(new BuyStock(stock));

        broker.placeOrders();
    }
}
