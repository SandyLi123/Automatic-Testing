package com.company;
import java.io.File;
import java.io.Reader;


public abstract class Chef {
        private String vegetable;
        private double calorie;
        public  Chef(String vegetable,double calorie){
            super();
            this.vegetable = vegetable;
            this.calorie = calorie;
        }

        public String getVegetable(){

            return vegetable;

        }
        public double getCalorie(){
            return calorie;
        }

        public void calculateCalorie(){
            System.out.println("The vegetable is "+this.vegetable);
        }
        // abstract String chef();
    }

