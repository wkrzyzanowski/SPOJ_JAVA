package pl.wiktor;

import java.util.*;
import java.lang.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class PP0504B {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int howManyCalculations = Integer.valueOf(br.readLine());
        String input;
        int iterations = 0;
        while ((input = br.readLine()) != null) {

            String[] arrays = input.split("\\s");

            String[] arrayOne = arrays[0].split("(?!^)");
            String[] arrayTwo = arrays[1].split("(?!^)");


            int smallerSize;
            if (arrayOne.length <= arrayTwo.length) {
                smallerSize = arrayOne.length;
            } else {
                smallerSize = arrayTwo.length;
            }

            for (int i = 0; i < smallerSize; i++) {
                System.out.print(arrayOne[i]);
                System.out.print(arrayTwo[i]);
            }

            System.out.print("\n");


            iterations++;
            if (iterations == howManyCalculations) {
                break;
            }
        }
    }
}