package com.gulsah.designpatternsexam.question1.decorators;

import com.gulsah.designpatternsexam.question1.Cake;

/**
 * Created by GulsahCoskun on 29.04.2018.
 */
public class PoppingCandy extends CakeDecorator{

    Cake cake;

    public PoppingCandy(Cake cake){
        this.cake = cake;
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " , Popping Candy";
    }

    @Override
    public double getCost() {
        return cake.getCost() + 4;
    }
}
