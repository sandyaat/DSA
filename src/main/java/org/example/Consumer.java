package org.example;

public class Consumer implements Runnable{
    @Override
    public void run() {
        System.out.println("consumer");
    }
}
