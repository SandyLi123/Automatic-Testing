//package com.company.car;
//
//import java.sql.*;
//
//import java.util.Collection;
//import java.util.concurrent.Callable;
//
//import static com.company.car.ReadConfig.readConfig;
//
//public class ConnectDB {
//    public static void connectDB(int result)  {
//        Connection cn = null;
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        try{
//            String url = readConfig("url");
//            String user = readConfig("user");
//            String pwd = readConfig("password");
//            String tableName = readConfig("tableName");
//            Connection con = DriverManager.getConnection(url, user, pwd);
//            Statement stmt = con.createStatement();
//            String sql = "insert into RESULT (name,total_cost) values ('test','"+result+"')";
//            stmt.executeUpdate(sql);
//            con.close();
//        } catch (SQLException e){
//            e.printStackTrace();
//        }
//    }
//}
//
//
