package com.tw.bootcamp.problem5.model;

import com.tw.bootcamp.problem5.exception.LimitExceededException;

public class Bag {
    private final int capacity;
    private int ballQuantity;

    public Bag() {
        this.capacity = 12;
        ballQuantity = 0;
    }

    public boolean add(Ball ball) {
        if (capacity == ballQuantity)
            throw new LimitExceededException("Error: Move exceeded the limit." +
                    " Can not add more balls in the bag.");
        ballQuantity++;
        return true;
    }
}
