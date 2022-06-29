/*
Refactor to create Generic Class to take in 3 variables of Generic Type
compareTo method compares two strings
 if s1 > s2, it returns positive number
if s1 < s2, it returns negative number
if s1 == s2, it returns 0
 */
package com.bridgelabz;
//Generic Class
public class MaxOfValues <E extends Comparable<E>>{
    E a1 , a2, a3; //Generics class variables
    //constructor
    public MaxOfValues(E a1, E a2, E a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }
    //Generics method to find max value
    public static <E extends Comparable<E>> E findMaxValue(E a1, E a2, E a3) {
        E max = a1; //initially a1 is largest
        if (a2.compareTo(max) > 0)
            max = a2;
        if (a3.compareTo(max) > 0)
            max = a3;
        return max;
    }
    //main method starts
    public static void main(String[] args) {
        //printing the max values
        System.out.println("The maximum of three integers: " +findMaxValue(110,200,150));
        System.out.println("The maximum of three floats: " +findMaxValue(44.98f, 18.70f, 99.06f));
        System.out.println("The maximum of three strings: " +findMaxValue("Australia", "Japan", "Canada"));
    }
}
