/*
Problem 3:  Biggest and smallest number in an array
Write a program to print the biggest and smallest number in the array. 

Input: arr[] = {1, 2, 3, 4, 5}
Output: Maximum is: 5
Minimum is: 1

Input: arr[] = {5, 3, 7, 4, 2}
Output: Maximum is: 7
Minimum is: 2

*/

import java.util.*;

public class _3_big_and_small{
    public static void main(String[] args) {
        
        //Arrays
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 3, 7, 4, 2};

        ArrayAnalyzer analyzer2 = new ArrayAnalyzer(arr2);
        ArrayAnalyzer analyzer1 = new ArrayAnalyzer(arr1);

        String result1 = analyzer1.find();
        String result2 = analyzer2.find();

        System.out.println(result1);
        System.out.println(result2);
    }
}

class ArrayAnalyzer{
    private int[] array;

    public ArrayAnalyzer(int[] array){
        this.array = array;
    }

    public String find(){
        int biggest = array[0];
        int smallest = array[0];

        for(int i=0; i < array.length; i++){
            if(array[i]>biggest){
                biggest = array[i];
            }
            else if(array[i]<smallest){
                smallest = array[i];
            }
        }

        return String.format("In array %s, Biggest Value: %d and Smallest Value: %d", Arrays.asList(array).toString(), biggest, smallest);
    }
}
