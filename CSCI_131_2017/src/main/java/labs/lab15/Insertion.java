package labs.lab15;

import java.util.ArrayList;

import utils.SortAlgorithms;

public class Insertion {

    public static void main(String[] args) {
        int[] arr = Maintainer.readFileIntoArray("../res/labs/lab15/unsorted100000.txt", 100000);

        long start = System.currentTimeMillis();
        
        // sort(arr);
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int n : arr)
            arrList.add(n);
        SortAlgorithms.bubble(arrList);
        
        long end = System.currentTimeMillis();

        System.out.println("Insertion sort time: " + (end - start));

        Maintainer.writeArrayToFile("../res/labs/lab15/SortedByInsertion.txt", arrList);
    }

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j -= 1;
            }
            arr[j + 1] = key;
        }
    }
}