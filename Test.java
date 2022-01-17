package com.company.car;


import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws Exception {

      CalculateCar cal = new CalculateCar();
      cal.orderByCost();
      cal.searchByCost();
      cal.connectDB();
    }
}