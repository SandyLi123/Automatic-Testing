package com.company;

import com.sun.deploy.net.proxy.ProxyUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.io.InputStream;


public class ReaderFile {

    //public method: read the value in config file
    public static String readConfig(String key) {
        Properties prop = new Properties();
        InputStream input = ProxyUtils.class.getResourceAsStream("/config.properties");
        String value = null;
        if (input != null) {
            try {
                prop.load(input);
                int available = input.available();
                value = prop.getProperty(key);
                System.out.print(value);
                input.close();

            } catch (Exception e) {
                System.out.println("Exception" + e);
            } finally {

            }
        }
        return value;
    }
    //public method: write local file
    public static void writeFile(){
        String filePath;
        String value = null;
        String vegetable1 ;
        String vegetable2 ;
        String vegetable3 ;

        //get file location:call readConfig
        filePath = readConfig("FilePath");
        // vegetable1 = Float.parseFloat(readConfig("tomato"));
        vegetable1 = readConfig("tomato");
        vegetable2 = readConfig("potato");
        vegetable3 = readConfig("chicken");

        //Start to write into file
        try{
            String content = vegetable1 + "," + vegetable2 + "," + vegetable3;
            File file = new File(filePath);
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    //public method: read the value in local file
    public static String readFile() {

        String str = "";
        int[][] les = null;
        File file = new File(readConfig("FilePath"));
        try {
            FileInputStream in = new FileInputStream(readConfig("FilePath"));
            //
            int size = in.available();
            byte[] buffer = new byte[size];
            in.read(buffer);
            in.close();
            str = new String(buffer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;

    }
    public static float calculateCalorie(List vegetableList,String calorie){
        float calorieTotal = 0;
        List<String> list = new ArrayList<String>();

        String calorieList = calorie;
        if()

        return a;
    }

    public static void main(String[] args){
        String c;
        writeFile();
        c= ReaderFile.readFile();
        System.out.print(c);
        }
    }

