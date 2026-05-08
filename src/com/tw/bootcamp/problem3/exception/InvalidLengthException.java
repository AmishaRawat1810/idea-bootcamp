package com.tw.bootcamp.problem3.exception;

public class InvalidLengthException extends Throwable {
    public InvalidLengthException() {
        super("ERROR: INVALID LENGTH ! Length should be measurable");
    }
}
