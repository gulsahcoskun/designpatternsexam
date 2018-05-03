package com.gulsah.designpatternsexam.question2;

/**
 * Created by GulsahCoskun on 1.05.2018.
 */
public class Stock {

    private String name = "Chocolate Stock";
    private int quantity = 1;

    public void buy(){
        quantity = quantity +1;
        System.out.println(name + " Added! Current Stock : " + quantity);
    }


    public void sell(){
        if(quantity>0){
            quantity = quantity-1;
            System.out.println(name + " Sold! Current Stock : " + quantity);
        }else{
            System.out.println(name + " Finished! Add New Stocks...");
        }

    }

}
