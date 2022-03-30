package com.company;

public class MyExeption extends RuntimeException{
    public MyExeption() {
    }

    public MyExeption(String message) {
        super(message);
    }
}
