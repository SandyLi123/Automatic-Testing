package com.company.car;

 class Car implements Comparable<Car>{
    protected String name;
    protected int cost;

    public Car() {

     }
   @Override
   public int compareTo(Car o){
        return this.cost-o.cost;
   }

     public String getName(){
        return name;
    }

     public void setName(String name) {
         this.name = name;
     }

     public void setCost(int cost) {
         this.cost = cost;
     }

     public float getCost(){
        return cost;
    }



    public Car(String name,int cost){
        this.name = name;
        this.cost = cost;
    }
}




