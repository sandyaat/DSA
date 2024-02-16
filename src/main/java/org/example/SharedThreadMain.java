package org.example;

public class SharedThreadMain {
    public static void main(String  args[]){
        SharedResource sr=new SharedResource();
        Thread t4=new Thread(()->{sr.getItem(1);});
        Thread t1=new Thread(()->{sr.addItem("test");});

        Thread t2=new Thread(()->{sr.addItem("test");});
        Thread t5=new Thread(()->{sr.addItem("test");});
        Thread t6=new Thread(()->{sr.addItem("test");});
        Thread t3=new Thread(()->{sr.addItem("test");});
t6.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

       // Thread t1=new Thread(()->{sr.addItem("test");});
    }
}
