/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution, Exercise 36
 *  Copyright 2021 Mayank Goyal
 */

package ex36;

import java.util.ArrayList;
import java.util.Scanner;

public class stats
{
        public static ArrayList<Integer> arr ;
        stats()
        {
            arr = new ArrayList<Integer>();
            Scanner scanner = new Scanner(System.in);
            String s;
            int num=0;
            while(true)
            {
                System.out.print("Enter a number: ");
                s = scanner.nextLine();
                if(s.equals("done"))
                {
                    break;
                }
                else
                {
                    num = 1;
                    for(int i = 0 ; i < s.length() ; i++)
                    {
                        if(Character.isDigit(s.charAt(i)))
                        {
                            continue;
                        }
                        else
                        {
                            num = 0;
                        }
                    }
                    if(num==1)
                    {
                        arr.add(Integer.parseInt(s));
                    }
                }
            }
        }

        static double average()
        {
            double average=0;
            for(int i=0;i<arr.size();i++)
            {
                average = average + arr.get(i);
            }
            average = average/arr.size();
            return average;
        }

        public static int min()
        {
            if(arr.size()==0)
            {
                return 0;
            }
            int minimum=arr.get(0);
            for(int i=1;i<arr.size();i++)
            {
                if(minimum>arr.get(i))
                {
                    minimum=arr.get(i);
                }
            }
            return minimum;
        }

        public static int max()
        {
            if(arr.size()==0)
            {
                return 0;
            }
            int maximum=arr.get(0);
            for(int i = 1 ; i < arr.size() ; i++)
            {
                if(maximum < arr.get(i))
                {
                    maximum = arr.get(i);
                }
            }
            return maximum;
        }

        public static double std()
        {
            double sum = 0;
            double sd = 0.0;
            double mean = 0;
            int n = arr.size();

            for (int i = 0; i < n; i++)
            {
                sum = sum + arr.get(i);
            }

            mean = sum / (n);

            for (int i = 0; i < n; i++)
            {
                sd = sd + Math.pow((arr.get(i) - mean), 2);
            }
            return Math.sqrt(sd / n);
        }

        public static void print()
        {
            System.out.print("Numbers: ");
            for(int i=0;i<arr.size();i++)
            {
                if(i!=arr.size()-1)
                {
                    System.out.print(+arr.get(i)+", ");
                }
                else
                {
                    System.out.println(arr.get(i));
                }
            }
        }


    }


