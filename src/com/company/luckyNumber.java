package com.company;

/**
 * Created by Yin on 10/12/2016.
 */
public class luckyNumber {
    public String name;

    public luckyNumber(String n)
    {
        name = n;
    }
    public int perfectRandom()
    {
        int i;
        int number;
        do {
            number = (int) (Math.random() * 100);
            i = (int) Math.sqrt(number);

        } while (number != i * i);
        return number;
    }

}
