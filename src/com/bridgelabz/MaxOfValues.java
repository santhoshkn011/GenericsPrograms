/*
Extend the max method to also print the max to std out using Generic Method
 */
package com.bridgelabz;

import java.util.Arrays;
//Generic Class
public class MaxOfValues <E extends Comparable<E>>{
    private E[] eArray; //declaring array
    //Constructor
    MaxOfValues(E[] eArray) {
        this.eArray = eArray;
    }
    //method to display the sorted array
    public void display() {
        System.out.println("\nBefore Sorting:");
        for(E element : eArray) {
            System.out.printf("%s", element + ", ");
        }
        Arrays.sort(eArray);
        System.out.println("\nAfter Sorting:");
        for(E element : eArray) {
            System.out.printf("%s", element + ", ");
        }
    }
    //Generics method to find max value
    public void findMaxValue() {
        for(int i=0; i<eArray.length-1; i++) {
            if(eArray[i].compareTo(eArray[i+1]) > 0) {
                eArray[i+1] = eArray[i];
            }
        }
//        System.out.println(eArray[eArray.length - 1]);
    }
    //Method to print the max value
    void printMax() {
//        Arrays.sort(eArray); //sorting the array
        System.out.println(eArray[eArray.length - 1]);  //max value
    }
    //main method starts
    public static void main(String[] args) {
        //Declaring the values to the arrays
        Integer[] integerValue = {110, 750, 150, 365, 450, 55};
        Float[] floatValue = {44.98f, 18.70f, 99.06f, 88.35f, 26.85f};
        String[] stringValue = {"Santhosh", "Kumar", "Nayak", "Namitha"};
        //Displaying the elements before and after sorting
        new MaxOfValues(integerValue).display(); System.out.println();
        new MaxOfValues(floatValue).display(); System.out.println();
        new MaxOfValues(stringValue).display(); System.out.println();
        //printing the max values
        new MaxOfValues(integerValue).findMaxValue();
        new MaxOfValues(floatValue).findMaxValue();
        new MaxOfValues(stringValue).findMaxValue();
        System.out.print("\nThe maximum of strings: " ); new MaxOfValues(stringValue).printMax();
        System.out.print("\nThe maximum of integers: " ); new MaxOfValues(integerValue).printMax();
        System.out.print("\nThe maximum of floats: "); new MaxOfValues(floatValue).printMax();
    }
}