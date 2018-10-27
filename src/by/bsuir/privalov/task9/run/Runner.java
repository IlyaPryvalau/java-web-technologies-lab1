package by.bsuir.privalov.task9.run;

import by.bsuir.privalov.task9.util.*;
import java.util.*;

public class Runner {
    public static void main(String[] args){
        int BALL_COUNT = 30;
        Bucket bucket = new Bucket();
        Random rand = new Random();
        Color[] colors = Color.values();

        for (int i = 0; i < BALL_COUNT; i++){
            bucket.addBall(new Ball(rand.nextInt(50) + 20,
                    colors[rand.nextInt(4)]));
        }

        int totalWeight = 0;
        int blueBallsCount = 0;
        for (Ball ball : bucket){
            totalWeight += ball.getWeight();
            if (ball.getColor() == Color.Blue){
                blueBallsCount++;
            }
        }

        System.out.format("Total weight: %d gramms%nBlue balls count: %d%n", totalWeight, blueBallsCount);
    }
}
