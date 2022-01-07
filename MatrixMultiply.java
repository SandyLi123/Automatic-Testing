package com.company;

import java.util.Scanner;

public class MatrixMultiply {

    public static int[][] change(int [][]matrix){
        int [][]temp=new int[matrix[0].length][matrix.length];
        int dst=matrix.length-1;

       for(int i=0;i<matrix.length;i++,dst--)
       {
            for(int j=0;j<matrix[0].length;j++){
                temp[j][dst]=matrix[i][j];
            }
        }
        return temp;
    }
        public static void main (String[]args) {
           int [][] a = {{2,3,4},{6,7,8}};
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
