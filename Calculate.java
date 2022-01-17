package com.company.car;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public interface Calculate {
    void orderByCost() throws MyException, IOException;
    void searchByCost() throws IOException, MyException;
    int calculateTotalCost() throws Exception;
    void connectDB();
}
