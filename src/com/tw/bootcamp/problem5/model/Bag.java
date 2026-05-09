package com.tw.bootcamp.problem5.model;

import com.tw.bootcamp.problem5.exception.LimitExceededException;

import java.util.ArrayList;
import java.util.HashMap;

public class Bag {
    private final HashMap<Colors, ArrayList<Ball>> organizedBalls;
    private int capacity;

    public Bag() {
        this.capacity = 12;
        organizedBalls = new HashMap<>();
    }

    public boolean add(Ball ball) {
        if (capacity == 0)
            throw new LimitExceededException("Error: Move exceeded the limit." +
                    " Can not add more balls in the bag.");

        Colors ballColor = ball.getColor();

        if (!organizedBalls.containsKey(ballColor)) {
            organizedBalls.put(ballColor, new ArrayList<>());
        }

        organizedBalls.get(ballColor).add(ball);
        capacity--;
        return true;
    }
}
