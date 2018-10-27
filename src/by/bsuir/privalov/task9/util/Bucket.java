package by.bsuir.privalov.task9.util;

import java.util.*;
import by.bsuir.privalov.task9.util.Ball;

public class Bucket implements Iterable<Ball>, Iterator<Ball> {
    private ArrayList<Ball> balls = new ArrayList <Ball>();

    public void addBall(Ball ball){
        balls.add(ball);
    }

    @Override
    public Iterator<Ball> iterator(){
        return balls.iterator();
    }

    @Override
    public boolean hasNext(){
        return balls.iterator().hasNext();
    }

    @Override
    public Ball next() {
        return balls.iterator().next();
    }
}
