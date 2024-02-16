package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class SharedResource  {

    List<String> ar=new ArrayList<String>(3);
    public synchronized void addItem(String i){
        System.out.println("add");
        int s;

    s=ar.size();

    if(s<3){
    ar.add(i);
    }

    }
    public  synchronized void getItem(int i){
        System.out.println("in get");
        int s;

            s=ar.size();

        if(s >0){
          System.out.println(ar.get(i));
        }
    }



}
