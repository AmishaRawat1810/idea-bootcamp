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
        validateBallAddition(ball);
        Colors ballColor = ball.getColor();
        organizedBalls.get(ballColor).add(ball);
        capacity--;
        return true;
    }

    private void validateBallAddition(Ball ball) {
        if (capacity == 0)
            throw new LimitExceededException("Error: Move exceeded the limit." +
                    " Can not add more balls in the bag.");

        Colors ballColor = ball.getColor();

        if (ballColor == Colors.GREEN && organizedBalls.get(ballColor).size() > 3) {
            throw new LimitExceededException("Error: Move exceeded the limit." +
                    " Can not add more green balls in the bag.");
        }

        if (!organizedBalls.containsKey(ballColor)) {
            organizedBalls.put(ballColor, new ArrayList<>());
        }
    }

    public String summary() {
        StringBuilder summaryOfBag = new StringBuilder();
        final int[] totalBalls = {0};

        organizedBalls.forEach(((colors, balls) -> {
            summaryOfBag.append(colors).append(": ").append(balls.size());
            totalBalls[0] += balls.size();
        }));

        summaryOfBag.append("\n\nTotal: ").append(totalBalls[0]);
        return String.valueOf(summaryOfBag);
    }
}
