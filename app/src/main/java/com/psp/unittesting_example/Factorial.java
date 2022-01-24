package com.psp.unittesting_example;

public class Factorial {

    public static double factorial(int arg) {
        if(arg == 0) {
            return 1.0;
        } else {
            return arg * factorial(arg-1);
        }
    }
}
