/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author malij6756
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public int countOnes(int[] array) {
        // counter holds how many times 1 occurs
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            // every time 1 occurs in the binary array, then add 1 to the counter
            if (array[i] == 1) {
                counter++;
            }
        }
        // returns counter in the end
        return counter;
    }

    public static void main(String[] args) {

        int[] numbers = {0, 0, 0, 1, 1, 1};

        A3Q3 test = new A3Q3();
        System.out.println(test.countOnes(numbers));


    }
}
