package com.gulsah.designpatternsexam.question1;

import com.gulsah.designpatternsexam.question1.decorators.Bonbon;
import com.gulsah.designpatternsexam.question1.decorators.PoppingCandy;

public class CakeTest {

    public static void main(String[] args) {
        Cake cake =  new SpongeCake();
        writeConsole(cake);
        cake = new Bonbon(cake);
        cake = new PoppingCandy(cake);
        writeConsole(cake);
        cake = new Bonbon(cake);
        writeConsole(cake);

    }

    private static void writeConsole(Cake cake) {
        System.out.println(cake.getDescription() + " : " +cake.getCost());
    }
}
