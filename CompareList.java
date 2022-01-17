package com.company.compare;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CompareList {
    static final int number= 100000;

    static List prepareList(List list){
        Random r = new Random();


        for (int i=0;i<number;i++){
            list.add(Math.random());
        }
        return list;
    }

    static long addList(List list){
        long star = System.currentTimeMillis();
        for (int i=0;i<number;i++){
            list.add(Math.random());
        }
        return System.currentTimeMillis() - star;
    }

    static long readAllList(List list){
        long star = System.currentTimeMillis();
        int j=list.size();
        for(int i = 0;i<j;i++){
            list.get(i);
        }
        return System.currentTimeMillis()-star;
    }

    static long readFixed(List list){
        long star = System.currentTimeMillis();
        Double x = (Double) list.get(1);
        System.out.println(x);
        return System.currentTimeMillis()-star;
    }

    static long removeList(List list){
        long star = System.currentTimeMillis();
        float x = (float) list.remove(1);

        return System.currentTimeMillis()-star;

    }
    public static void main(String[] args){
        System.out.println("ArrayList add 20000 records need:"+addList(new ArrayList()));
        System.out.println("LinkedList add 20000 records need:"+addList(new LinkedList()));

        List arrayList = prepareList(new ArrayList());
        //System.out.println("arraylist is" + arrayList);
        List linkedList = prepareList(new LinkedList());
        //System.out.println("arraylist is" + linkedList);

        System.out.println("ArrayList read 20000 records need:"+readAllList(arrayList));
        System.out.println("LinkedList read 20000 records need:"+readAllList(linkedList));

        System.out.println("Search fixed value from ArrayList need:"+readFixed(arrayList));
        System.out.println("Search fixed value from LinkedList need:"+readFixed(linkedList));

        System.out.println("removed from ArrayList need:"+readFixed(arrayList));
        System.out.println("removed from LinkedList need::"+readFixed(linkedList));
    }

}


