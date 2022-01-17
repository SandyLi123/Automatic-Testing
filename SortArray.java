package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortArray {
    public static void main(String[] args){
        String str[] = {"please","sort","the","list"};
        System.out.println("Original list:");
        for(int i =0;i<str.length;i++){
            System.out.println(str[i]);
        }
        System.out.println("Sorted list:");

        for(int i = 0; i< str.length;i++){
            for(int j=0;j<str.length-i-1;j++){
                if(str[j].length()>str[j+1].length()){
                    String temp;
                    temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        }

       for (int i=0;i<str.length;i++){
           System.out.println(str[i]);
       }
    }

}
