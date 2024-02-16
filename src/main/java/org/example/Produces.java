package org.example;

public class Produces implements Runnable{
    @Override
    public void run() {
        System.out.println("producer thread");
    }
}
