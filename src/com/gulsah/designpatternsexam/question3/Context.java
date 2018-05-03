package com.gulsah.designpatternsexam.question3;

import com.gulsah.designpatternsexam.question3.strategy.OperationStrategy;

/**
 * Created by GulsahCoskun on 1.05.2018.
 */
public class Context {

    private OperationStrategy strategy;

    public Context(OperationStrategy strategy){
        this.strategy = strategy;
    }

    public void execute(int number1, int number2){
        int result = strategy.doOperation(number1,number2);
        System.out.println(strategy.getClass().getSimpleName() + " executed for " + number1 + " and " + number2);
        System.out.println("Result : " + result);
        System.out.println("-------------");
    }

}
