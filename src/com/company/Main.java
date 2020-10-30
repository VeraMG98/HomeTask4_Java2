package com.company;

public class Main {

    public static void main(String[] args) {
        Runner runner ;
        for (int i = 1; i < 6; i++) {
            runner = new Runner("Runner", i);
            
            runner.start();
        }
    }
}

