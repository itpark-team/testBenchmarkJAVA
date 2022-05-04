package com.company;

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        System.out.println(startTime);

        for (int i = 0; i < 1000000; i++) {
            double a = Math.sqrt(Math.pow(i, 2)) * Math.sqrt(Math.pow(i, 2));
        }

        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime);

        long deltaTime = finishTime - startTime;
        System.out.println("runtime in Millis = " + deltaTime);
    }
}
