package com.company.compare;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static com.company.car.ReadConfig.readConfig;

public class CompareSet {
    static long bulkAdd(Set set) throws IOException {

        String filePath = readConfig("SetFilePath");
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        long star = System.currentTimeMillis();
        while((line = br.readLine()) != null){
            String[] array = line.split(",");
            set.add(array[0]);
        }
        br.close();
        return System.currentTimeMillis()-star;

    }

    static Set prepareSet(Set set) throws IOException {

        String filePath = readConfig("SetFilePath");
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;

        while((line = br.readLine()) != null){
            String[] array = line.split(",");
            set.add(array[0]);
        }
        br.close();
        return set;

    }

    static long  add(Set set){
        long star = System.currentTimeMillis();
        set.add("11115");
        return System.currentTimeMillis() - star;
    }

    static long search(Set set){

        long star = System.currentTimeMillis();
        boolean a = set.contains("100");
        System.out.print(a+"\n");
        return System.currentTimeMillis() - star;


    }

    static long remove(Set set){
        long star = System.currentTimeMillis();

        boolean s = set.remove("1");;
        System.out.println(s+"\n");
        return System.currentTimeMillis() - star;

    }

    public static void main(String[] args) throws IOException {
        //Read 11114 records from text to Map
        System.out.println("HashSet add 11114 records need:"+bulkAdd(new HashSet()));
        System.out.println("TreeSet add 11114 records need:"+bulkAdd(new TreeSet()));

        //Prepare set for add,search,remove
        HashSet hs = new HashSet<>(prepareSet(new HashSet()));
        TreeSet ts = new TreeSet(prepareSet(new TreeSet()));

        //add record to map
        System.out.println("add 1 record to HashSet need :"+add(hs));
        System.out.println("add 1 record to TreeSet need :"+add(ts));

        //search record in map

        System.out.println("search  record in HashSet need :"+search(hs));
        System.out.println("search  record in TreeSet need :"+search(ts));

        //remove record from map

        System.out.println("remove 1 record from HashSet need :"+remove(hs));
        System.out.println("remove 1 record from TreeSet need :"+remove(ts));
    }
}
