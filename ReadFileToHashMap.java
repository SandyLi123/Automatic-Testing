package com.company.car;

import java.io.*;
import java.util.*;

import static com.company.car.ReadConfig.readConfig;


public class ReadFileToHashMap {
    //public method: read the value in local file
    public HashMap readFile() throws IOException {
        //获取文件路径
        String filePath = readConfig("FilePath");
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        HashMap<Integer,String> hp = new HashMap();

        String line;
        while((line = br.readLine()) != null){
            String[] array = line.split(",");
            hp.put(Integer.parseInt(array[1]),array[0] );
        }
        br.close();
        return hp;
    }


}

