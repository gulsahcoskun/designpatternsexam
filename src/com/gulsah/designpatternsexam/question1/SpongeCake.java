package com.gulsah.designpatternsexam.question1;

/**
 * Created by GulsahCoskun on 29.04.2018.
 */
public class SpongeCake implements Cake {


    public SpongeCake(){
        getDescription();
    }


    @Override
    public String getDescription() {
        return "SpongeCake ";
    }

    @Override
    public double getCost() {
        return 20.50;
    }
}
