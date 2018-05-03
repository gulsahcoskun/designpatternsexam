package com.gulsah.designpatternsexam.question1.decorators;

import com.gulsah.designpatternsexam.question1.Cake;

/**
 * Created by GulsahCoskun on 29.04.2018.
 */
public class ColorfulCandy extends CakeDecorator {

    Cake cake;

    public ColorfulCandy(Cake cake){
        this.cake = cake;
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " , Colorful Candy";
    }

    @Override
    public double getCost() {
        return cake.getCost() + 2;
    }
}
