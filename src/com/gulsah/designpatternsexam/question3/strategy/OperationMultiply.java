package com.gulsah.designpatternsexam.question3.strategy;

/**
 * Created by GulsahCoskun on 1.05.2018.
 */
public class OperationMultiply implements OperationStrategy {

    @Override
    public int doOperation(int number1, int number2) {
        return number1*number2;
    }

}
