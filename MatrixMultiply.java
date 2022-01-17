package com.company;

import java.util.Scanner;

public class MatrixMultiply {

    public static int[][] change(int [][]a){
        int [][]temp=new int[a[0].length][a.length];
        int tempCl=a.length-1;

       for(int i=0;i<a.length;i++,tempCl--)
       {
            for(int j=0;j<a[0].length;j++){
                temp[j][tempCl]=a[i][j];
            }
        }
        return temp;
    }
        public static void main (String[]args) {
           int [][] a = {{1,2,3},{4,5,6},{7,8,9}};
           int [][] temp = change(a);
           for(int i=0;i<temp.length;i++)
            {
               for(int j=0;j<temp[0].length;j++)
               {
                  System.out.print(temp[i][j]+"\t");
               }
                System.out.println();
            }

        }
}
