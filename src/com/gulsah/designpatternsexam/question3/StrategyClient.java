package com.gulsah.designpatternsexam.question3;

import com.gulsah.designpatternsexam.question3.strategy.OperationAdd;
import com.gulsah.designpatternsexam.question3.strategy.OperationMultiply;
import com.gulsah.designpatternsexam.question3.strategy.OperationSubsract;

/**
 * Created by GulsahCoskun on 1.05.2018.
 */
public class StrategyClient {

    public static void main(String[] args) {
        System.out.println("--Arithmetic Operations--");
        Context context = new Context(new OperationAdd());
        context.execute(467,56789);
        context.execute(45,9999);

        context = new Context(new OperationMultiply());
        context.execute(6,8);
        context.execute(123,567);

        context =  new Context(new OperationSubsract());
        context.execute(67,-789);
        context.execute(333,4);


    }

}
