package com.company;

import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner n = new Scanner(System.in);
        do {


            System.out.println("Enter your name: ");
            String yourName = n.next();
            luckyNumber num1 = new luckyNumber(yourName);
            System.out.println("Nice to meet you, " + num1.name + ". " + "Your lucky number is: " + num1.perfectRandom());
            System.out.println("0 = exit, 1 = listing of the name and randomNumber, 2 = enter another name");
            String r = n.next();
            if (r.equals("0")) {
                break;
            } else if (r.equals("1")) {
                System.out.println(num1.name + "  " + num1.perfectRandom());
                break;
            }
        } while (true);
    }
}
