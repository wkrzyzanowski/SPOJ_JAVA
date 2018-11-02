package pl.wiktor;

import java.util.*;
import java.lang.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PP0502B {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int howManyCalculations = Integer.valueOf(br.readLine());
        String input;
        int iterations = 0;
        while ((input = br.readLine()) != null) {

            String[] array = input.split("\\s");

            List<String> finalList = new ArrayList<>();

            for (int i = 1; i < array.length; i++) {
                finalList.add(array[i]);
            }

            Collections.reverse(finalList);

            for (int i = 0; i < finalList.size(); i++) {
                System.out.print(finalList.get(i) + " ");
            }

            System.out.print("\n");
            iterations++;
            if (iterations == howManyCalculations) {
                break;
            }
        }
    }
}