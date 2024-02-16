package org.example;

public class threadmain {
    public static void main(String args[]){
        multithreadingLearning runnableObj=new multithreadingLearning();
        Thread thread=new Thread(runnableObj);
        thread.start();
    }



}
