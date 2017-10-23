/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author malij6756
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public int smallestMissingNumber(int[] array) {
        // keep track of what we're sorting
        int lowestNumber = 0;
        for (int position = 0; position < array.length; position++) {
            // if the number that should be there is, then add 1 to the lowestNumber counter and
            if (lowestNumber == array[position]) {
                lowestNumber++;
                // if the next number doesn't equal what it should be, then that is the lowest number that's missing
            } else {
                break;
            }
        }
        // returns the lowestNumber missing
        return lowestNumber;
    }

    public static void main(String[] args) {

        int[] numbers = {0, 1, 2, 3, 5, 6, 7, 8, 9, 10};


        A3Q2 test = new A3Q2();
        test.smallestMissingNumber(numbers);
        System.out.println(test.smallestMissingNumber(numbers));


    }

    public void swap(int[] array, int p1, int p2) {
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;

    }
}
