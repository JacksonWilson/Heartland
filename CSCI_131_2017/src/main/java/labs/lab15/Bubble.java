package labs.lab15;

import java.util.ArrayList;

import utils.SortAlgorithms;

public class Bubble {

    public static void main(String[] args) {
        int[] arr = Maintainer.readFileIntoArray("../res/labs/lab15/unsorted100000.txt", 100000);

        long start = System.currentTimeMillis();
        
        //sort(arr);
        // SortAlgorithms.bubble(arr);
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int n : arr)
            arrList.add(n);
        SortAlgorithms.bubble(arrList);

        long end = System.currentTimeMillis();

        System.out.println("Bubble sort time: " + (end - start));

        Maintainer.writeArrayToFile("../res/labs/lab15/SortedByBubble.txt", arrList);
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}