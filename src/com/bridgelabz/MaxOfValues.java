/*
compareTo method compares two strings
 if s1 > s2, it returns positive number
if s1 < s2, it returns negative number
if s1 == s2, it returns 0
 */
package com.bridgelabz;
import java.util.Scanner;//Importing Scanner

public class MaxOfValues {
    //method to find max of three integers
    public static void findMaxValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Three Numbers: ");
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        Integer c = sc.nextInt();
        Integer max = a; //Initially maximum value is Integer a.
        if (b.compareTo(max) > 0) //compares Strings.
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        System.out.printf("The Maximum of three Integers (%d, %d and %d): ", a, b, c).println(max);
    }
    //method to find max of three floats
    public static void findMaxValue(Float a , Float b , Float c){
        Float max = a; //Initially maximum value is Integer a.
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        // Print the max number
        System.out.printf("The Maximum of three Float Numbers (%f, %f and %f): ",a,b,c).println(max);
    }
    //Method to find Maximum of three Strings
    public static void findMaxValue(String string1 , String string2, String string3){
        String max = string1;//Initially maximum value is String s1.
        if (string2.compareTo(max) > 0) //J and A, the difference is 9(Positive). J is 9 times greater than A
            max = string2;
        if (string3.compareTo(max) > 0) //C and J, the difference is -7(Negative). C is 7 times less than J.
            max = string3;
        System.out.printf("The Maximum of three Strings (%s, %s and %s): ",string1,string2,string3).println(max);
    }
    //main method starts
    public static void main(String[] args) {
        MaxOfValues.findMaxValue(); //calling the method
        MaxOfValues.findMaxValue(80f,75f,105f);
        MaxOfValues.findMaxValue("Australia","Japan","Canada");
    }
}
