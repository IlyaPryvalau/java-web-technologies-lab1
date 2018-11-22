package by.bsuir.privalov.task9.test;

import by.bsuir.privalov.task9.util.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;
import java.util.*;

import static org.junit.Assert.*;

public class BucketTest {

    private Bucket bucket;
    private int blueBallCount;
    private int ballsTotalWeight;

    @Before
    public void CreateBucket() {
        bucket = new Bucket();
        bucket.addBall(new Ball(10, Color.Blue));
        bucket.addBall(new Ball(15, Color.White));
        bucket.addBall(new Ball(12, Color.Green));
        bucket.addBall(new Ball(30, Color.Blue));
        bucket.addBall(new Ball(6, Color.Red));
        blueBallCount = 2;
        ballsTotalWeight = 73;
    }

    @Test
    public void CountingBlueBalls(){
        int count = 0;
        for (Ball b: bucket) {
            if (b.getColor() == Color.Blue){
                count++;
            }
        }
        Assert.assertEquals(blueBallCount, count);
    }

    @Test
    public void WeightingBalls(){
        int weight = 0;
        for (Ball b: bucket) {
            weight += b.getWeight();
        }
        Assert.assertEquals(ballsTotalWeight, weight);
    }
}