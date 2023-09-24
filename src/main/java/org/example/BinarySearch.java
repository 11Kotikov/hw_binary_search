package org.example;

public class BinarySearch {

    private int binarySearch(int[] sortedArray, int valueToFind, int first, int last) {
        int i = -1;

        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (sortedArray[mid] < valueToFind) {
                first = mid + 1;
            } else if (sortedArray[mid] > valueToFind) {
                last = mid - 1;
            } else if (sortedArray[mid] == valueToFind) {
                i = mid;
                break;
            }
        }
        if (i == -1) {
            System.out.println("There's no any valid number");
        }
        return i;
    }

    public int findIndex(int[] sortedArray, int valueToFind) {
        return binarySearch(sortedArray, valueToFind, 0, sortedArray.length - 1);
    }
}
