package labs.lab15;

import java.io.*;
import java.util.ArrayList;

public class Maintainer {
    public static int[] readFileIntoArray (String fileName, int size) {
        //Reads a file of integers (indicated by the fileName variable) into an integer array and returns the array
        //The number of integers in the file is indicated by the size variable
        BufferedReader br;
        int [] nums = new int[size];

        try {
            br = new BufferedReader(new FileReader(fileName));

            for (int i = 0; i < size; i++) {
                nums[i] = Integer.valueOf(br.readLine());
            }

            br.close();
        }

        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

        return nums;
    }

    public static void writeArrayToFile (String fileName, int [] numsToWrite) {
        //Wrties an array of integers to a file as indicated by the parameters
        BufferedWriter bw;

        try {
            bw = new BufferedWriter(new FileWriter(fileName));

            for (int n : numsToWrite) {
                bw.write(String.valueOf(n));
                bw.newLine();
            }

            bw.close();
        }

        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    public static <T> void writeArrayToFile (String fileName, ArrayList<T> listToWrite) {
        //Wrties an array of integers to a file as indicated by the parameters
        BufferedWriter bw;

        try {
            bw = new BufferedWriter(new FileWriter(fileName));

            for (T v : listToWrite) {
                bw.write(String.valueOf(v));
                bw.newLine();
            }

            bw.close();
        }

        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}