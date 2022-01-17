package com.company.compare;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static com.company.car.ReadConfig.readConfig;

public class CompareMaps {
    static long bulkAdd(Map map) throws IOException {
        String filePath = readConfig("MapFilePath");
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        //HashMap<Integer,String> hp = new HashMap();

        String line;
        long star = System.currentTimeMillis();
        while((line = br.readLine()) != null){
            String[] array = line.split(",");
            map.put(array[0].trim(),array[1].trim() );
        }
        br.close();
        return System.currentTimeMillis() - star;
    }
    static Map prepareList(Map map) throws IOException {
        String filePath = readConfig("MapFilePath");
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String line;
        long star = System.currentTimeMillis();
        while((line = br.readLine()) != null){
            String[] array = line.split(",");
            map.put(array[0].trim(),array[1].trim() );
        }
        br.close();
        return map;
    }

    static long  add(Map map){
        long star = System.currentTimeMillis();
        map.put("11115","name11115");
        return System.currentTimeMillis() - star;
    }

    static long search(Map map){
        long star = System.currentTimeMillis();
        String s = (String) map.get("100");
        System.out.println(s);
        return System.currentTimeMillis() - star;

    }

    static long remove(Map map){
        long star = System.currentTimeMillis();
        String s = (String) map.remove("200");
        System.out.println(s);
        return System.currentTimeMillis() - star;

    }

    public static void main(String[] args) throws IOException {
        //Read 11114 records from text to Map
        System.out.println("HashMap add 11114 records need:"+bulkAdd(new HashMap<String,String>()));
        System.out.println("TreeMap add 11114 records need:"+bulkAdd(new TreeMap<String,String>()));

        //Prepare Map for remove, add and search
        HashMap hp = new HashMap<>(prepareList(new HashMap<>()));
        TreeMap tp = new TreeMap(prepareList(new TreeMap()));

        //add record to map
        System.out.println("add 1 record to HaspMap need :"+add(hp));
        System.out.println("add 1 record to HaspMap need :"+add(tp));

        //search record in map

        System.out.println("search 1 record in HaspMap need :"+search(hp));
        System.out.println("search 1 record in HaspMap need :"+search(tp));

        //remove record from map

        System.out.println("remove 1 record from HaspMap need :"+remove(hp));
        System.out.println("search 1 record from HaspMap need :"+remove(tp));


    }
}
