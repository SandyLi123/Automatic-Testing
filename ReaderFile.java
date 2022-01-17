package com.company.car;

import java.io.*;
import java.util.*;

import static com.company.car.ReadConfig.readConfig;


public class ReaderFile {
    //public method: read the value in local file
    public ArrayList readFile() throws IOException {
        //获取文件路径
        String filePath = readConfig("FilePath");
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        ArrayList<Car> list = new ArrayList<Car>();
        String line;
        while((line = br.readLine()) != null){
            String[] array = line.split(",");
            Car s = new Car();
            s.setName(array[0]);
            s.setCost(Integer.parseInt(array[1]));
            list.add(s);
        }

        br.close();
        return list;
    }


}

