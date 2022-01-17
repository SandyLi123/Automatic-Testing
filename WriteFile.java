//package com.company.car;
//
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//
//import static com.company.car.ReadConfig.readConfig;
//
//
//public class WriteFile {
//    //public method: write local file
//    public  void writeFile() throws IOException {
//        ArrayList<Car> car = new ArrayList<Car>();
//        Car aodi = new Car("奥迪",6,10,true,200);
//        car.add(aodi);
//       //读取文件路径
//        String filePath = readConfig("FilePath");
//        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
//        for(Car s : car){
//            //按固定的格式把数据拼接成字符串
//            StringBuilder sb = new StringBuilder();
//            sb.append(s.getName()).append(",").append(s.getOilCost()).append(",").
//                    append(s.getOriginalNumber()).append(",").append(s.getInUsed()).append(",").
//                    append(s.getMileage());
//            //拼接好的字符串写进文件里
//            bw.write(sb.toString());
//            bw.newLine();
//            bw.flush();
//        }
//        bw.close();
//
//        }
//    }
//
