package com.gulsah.designpatternsexam.question1;

/**
 * Created by GulsahCoskun on 29.04.2018.
 */
public class BaseCake implements Cake {


    public BaseCake(){
        getDescription();
    }

    @Override
    public String getDescription() {
        return "BaseCake ";
    }

    @Override
    public double getCost() {
        return 15.50;
    }
}
