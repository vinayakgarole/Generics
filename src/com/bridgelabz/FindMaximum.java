package com.bridgelabz;

public class FindMaximum {

    public static <T extends Comparable<T>> T maxOfValues(T a1, T a2, T a3) {

        T max = a1;

        if (a2.compareTo(max) > 0)
            max = a2;

        if (a3.compareTo(max) > 0)
            max = a3;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Find Maximun Problem Using Generics \n");
        System.out.println("The maximum value between the three integer is: " + maxOfValues(3, 8, 5) + "\n");
        System.out.println("The maximum value between the three float is: " + maxOfValues(1.5f, 3.56f, 5.87f) + "\n");
        System.out.println("The maximum value between the three string is: " + maxOfValues("abc", "pqr", "xyz"));
    }
}