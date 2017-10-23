/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Arrays;

/**
 *
 * @author malij6756
 */
public class A3Q1 {

    public void selectionSort(int[] array) {


        // keep track of what we're sorting
        for (int position = 0; position < array.length; position++) {
            // go through the rest looking for a smaller number

            // the lowest number in the array will first be defined as the first number being sorted this time around
            int lowestNumber = array[position];
            // the first number being sorted will be considered as the lowest number until another lower number is found
            int positionLow = position;


            // if a lower number is found in the array, that number will become the value compared to the numbers that continue to come in the array
            for (int i = position + 1; i < array.length; i++) {
                // have we found smaller?
                if (array[i] < lowestNumber) {
                    // the position of the lower number and the number itself is stored
                    positionLow = i;
                    lowestNumber = array[i];

                }
            }
            // lowest position swapped with the lowest 
            swap(array, position, positionLow);
        }


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // array of random 10 numbers
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            // make a random number
            numbers[i] = (int) (Math.random() * 101);
        }

        A3Q1 test = new A3Q1();
        test.selectionSort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }

    public void swap(int[] array, int p1, int p2) {
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;

    }
}
