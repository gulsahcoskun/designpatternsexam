package com.gulsah.designpatternsexam.question2.command;

import com.gulsah.designpatternsexam.question2.Stock;

/**
 * Created by GulsahCoskun on 1.05.2018.
 */
public class SellStock implements Order {


    private Stock stock;

    public SellStock(Stock stock){
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
