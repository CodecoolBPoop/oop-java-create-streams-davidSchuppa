package com.codecool;

import java.util.function.Supplier;

public class Fibonacci implements Supplier {

    private int previous = 1;
    private int current = 2;
    private int next;

    @Override
    public Integer get(){
        next = previous + current;
        int actual = previous;
        previous = current;
        current = next;
        return actual;
    }
}
