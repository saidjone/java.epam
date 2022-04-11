package java.epam.task1;

import java.epam.task1.srfc.Calculator;
import java.epam.task1.srfc.CartforBall;
import java.epam.task1.srfc.GivenBall;
import java.epam.task1.srfc.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main (String[] args){
        List<GivenBall> liftoffBalls = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++)
        {
            liftoffBalls.add(new GivenBall(rnd.nextInt(1)+ 10, Color.getRandomColor()));
        }
        CartforBall basket = new CartforBall(liftoffBalls);
        System.out.println(Calculator.countColoredBalls(Color.BLUE, basket));
    }

}