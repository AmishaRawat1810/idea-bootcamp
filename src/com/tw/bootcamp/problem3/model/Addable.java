package com.tw.bootcamp.problem3.model;

import com.tw.bootcamp.problem3.exception.InvalidNumberOfUnitsException;

public interface Addable<T extends Measurement> {
    T add(T other) throws InvalidNumberOfUnitsException;
}
