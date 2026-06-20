package com.java.controlFlow;

public class Mystery {

    public static void main(String[] args) {

        int value = calculate(4);

        System.out.println(value);
    }

    static int calculate(int n) {

        int result = 1;

        for(int i = 1; i <= n; i++) {

            result = transform(result, i);
        }

        return result;
    }

    static int transform(int current, int step) {

        if(step % 2 == 0) {
            return current + (step * 2);
        }

        return current * step;
    }
}