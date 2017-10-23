/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author malij6756
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public void countingSort(int[] array) {

        // creates an array to store how many of each number occurs in the original array
        int[] counter = new int[101];

        // adds to the counter position which corresponds to the number when the original array is ran through
        for (int i = 0; i < array.length; i++) {
            counter[array[i]]++;
        }

        // prints out the number that occurs as many times as it did in every position of the counter array
        for (int i = 0; i < counter.length; i++) {
            for (int j = 0; j < counter[i]; j++) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {

        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            // make a random number
            numbers[i] = (int) (Math.random() * 101);
        }

        A3Q4 test = new A3Q4();
        test.countingSort(numbers);
    }
}
