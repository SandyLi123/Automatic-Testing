package com.company.car;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import static com.company.car.ReadConfig.readConfig;

class CalculateCar extends Car implements Calculate {
    public CalculateCar(String name, int cost) throws MyException {
        super(name, cost);
        //define to make sure the oil cost > 0
        if (cost < 0) {
            throw new MyException("the oil cost cannot be negative number");
        }
    }

    public CalculateCar() {
        super();
    }


    @Override
    public void orderByCost() throws MyException, IOException {
        ReaderFile readerFile = new ReaderFile();
        ArrayList<Car> list = readerFile.readFile();
        TreeSet<Car> set = new TreeSet<Car>(list);
        System.out.print("order by cost \n");
        for (Car s : set) {
            System.out.print(s.getName() + s.getCost() + "\n");
        }
    }

    @Override
    public void searchByCost() throws IOException, MyException {
        ReadFileToHashMap rf = new ReadFileToHashMap();
        HashMap<Integer, String> map = rf.readFile();
        System.out.println("The value:" + map.keySet());
        System.out.println("The name" + map.values());

        Scanner scanner = new Scanner(System.in);
        System.out.println("please in put the cost you wanted:\n");
        int key = scanner.nextInt();
        if (map.containsKey(key)){
            System.out.println(key + "油耗的车是" + map.get(key));
        }else{
            throw new MyException("The oil cost you input didn`t exist");
        }
    }

    @Override
    public int calculateTotalCost() throws Exception {
        ReaderFile readerFile = new ReaderFile();
        ArrayList<Car> list = readerFile.readFile();
        TreeSet<Car> set = new TreeSet<Car>(list);
        int result = 0;
        for (Car s : set) {
            result += s.getCost();
        }

        System.out.println(result);
        return result;

    }

    @Override
    public void connectDB() {
        Connection cn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            String url = readConfig("url");
            String user = readConfig("user");
            String pwd = readConfig("password");
            String tableName = readConfig("tableName");
            Connection con = DriverManager.getConnection(url, user, pwd);
            Statement stmt = con.createStatement();
            int result = calculateTotalCost();
            String sql = "insert into RESULT (name,total_cost) values ('taxi','" + result + "')";
            stmt.executeUpdate(sql);
            System.out.println("Database insert finished");
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


