package com.itschool.Classes;

public class Money {
    int intPart;
    int floatPart;

    @Override
    public String toString() {
        return intPart + "," + floatPart;
    }
}
