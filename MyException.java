package com.company.car;

public class MyException extends Exception{
    String message;
    public MyException(String ErrorMessage){
        super(ErrorMessage);
    }
    public String getErrorMessage(){
        return message;
    }


}
