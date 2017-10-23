/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author malij6756
 */
public class A3Q5 {

    public void swap(String[] array, int p1, int p2) {
        String temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;

    }
    private static String letters[] = new String[]{"Qwe", "Qaw", "Car", "Dust", "Esters", "Man"};

    public void wordSort(String[] array) {

        // start going through the array
        for (int i = 0; i < array.length - 1; i++) {
            // store position
            int position = i;
            // check words beside each other
            while (position >= 0 && array[i].compareTo(array[i]) >= -1) {
                // if out of alphabetic order, swap it downwards
                // until correct position is reached
                swap(array, position, position + 1);
                position--;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {



        A3Q5 test = new A3Q5();
        test.wordSort(letters);
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }

    }
}
