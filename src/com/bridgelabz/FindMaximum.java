package com.bridgelabz;

public class FindMaximum {

    public static Integer maxOfInteger(Integer a1, Integer a2, Integer a3) {

        Integer max = a1;

        if (a2.compareTo(max) > 0)
            max = a2;

        if (a3.compareTo(max) > 0)
            max = a3;
        return max;
    }

    public static Float maxOfFloat(Float a1, Float a2, Float a3) {

        Float max = a1;

        if (a2.compareTo(max) > 0)
            max = a2;

        if (a3.compareTo(max) > 0)
            max = a3;
        return max;
    }

    public static String maxOfString(String a1, String a2, String a3) {

        String max = a1;

        if (a2.compareTo(max) > 0)
            max = a2;

        if (a3.compareTo(max) > 0)
            max = a3;
        return max;
    }

    public static void main(String[] args) {

        System.out.println("Welcome To Find Maximum Problem Using Generics\n");
        System.out.println("The maximum value between the three integer is: " + maxOfInteger(3, 8, 5));
        System.out.println("------------------------------------------------");
        System.out.println("The maximum value between the three float is: " + maxOfFloat(3.12F, 8.14F, 5.32F));
        System.out.println("------------------------------------------------");
        System.out.println("The maximum value between the three String is: " + maxOfString("Apple", "Banana", "Peach"));
    }
}