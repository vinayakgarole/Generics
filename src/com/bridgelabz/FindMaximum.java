package com.bridgelabz;

public class FindMaximum {

    public static Float maxOfFloat(Float a1, Float a2, Float a3) {

        Float max = a1;

        if (a2.compareTo(max) > 0)
            max = a2;

        if (a3.compareTo(max) > 0)
            max = a3;
        return max;
    }

    public static void main(String[] args) {

        System.out.println("Welcome To Find Maximum Problem Using Generics");
        System.out.println("The maximum value between the three float is: " + maxOfFloat(3.12F, 8.14F, 5.32F));
    }
}