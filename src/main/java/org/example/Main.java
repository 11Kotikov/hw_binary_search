package org.example;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6, 7, 8, 9, 10};
        int valueToFind = -1;
        BinarySearch iCanReturnYourValueToFind = new BinarySearch();

        int indexOfValue = iCanReturnYourValueToFind.findIndex(array, valueToFind);
        System.out.println("The index of [" + valueToFind + "] is " + indexOfValue );
    }

}