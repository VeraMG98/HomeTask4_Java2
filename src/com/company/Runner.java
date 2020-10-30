package com.company;

public class Runner extends Thread{
    private int index;

    Runner(String name, int index) {
        super(name);
        this.index = index;
    }

    public void run(){
        try {

            if (index == 5) {
                System.out.println(this.getName() + index + " берет палочку"
                        + "\n" + this.getName() + index + " бежит к финишу");
            } else
                System.out.println(this.getName() + index + " берет палочку"
                        + "\n" + this.getName() + index + " бежит к "
                        + this.getName() + (index + 1));
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread has been interrupted");
        }
        if (index == 1) {
            System.out.println(this.getName() + index + " берет палочку"
                    + "\n" + this.getName() + index + " бежит к финишу");
        } else {
            System.out.println(this.getName() + index + " берет палочку"
                + "\n" + this.getName() + index + " бежит к "
                + this.getName() + (index - 1));
        }
    }
}