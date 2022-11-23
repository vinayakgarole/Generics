package com.bridgelabz;

public class FindMaximum<T extends Comparable<T>> {

    T a1, a2, a3;

    public FindMaximum(T a1, T a2, T a3) {

        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public static <T extends Comparable <T>> T maxOfValues(T a1, T a2, T a3) {

        T max = a1;

        if (a2.compareTo(max) > 0)
            max = a2;

        if (a3.compareTo(max) > 0)
            max = a3;
        return max;
    }

    public static void main(String[] args) {

        System.out.println("Welcome To Find Maximum Problem Using Generics \n");
        System.out.println("The maximum value between the three integer is: " + maxOfValues(3, 8, 5) + "\n");
        System.out.println("The maximum value between the three float is: " + maxOfValues(1.5F, 3.56F, 5.87F) + "\n");
        System.out.println("The maximum value between the three string is: " + maxOfValues("Apple", "Peach", "Banana"));
    }
}