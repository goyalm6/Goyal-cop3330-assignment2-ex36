/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 36
 *  Copyright 2021 Mayank Goyal
 */

package ex36;

import java.util.*;
import java.lang.*;


public class Main
{
    public static void main(String [] args)
    {
        stats s = new stats();
        s.print();
        assert s.average() == 400.0;
        System.out.println("The average is "+s.average());

        assert s.min() == 100;
        System.out.println("The minimum is "+s.min());

        assert s.max() == 1000;
        System.out.println("The maximum is "+s.max());

        System.out.printf("The standard deviation is %.2f",s.std());
    }
}
