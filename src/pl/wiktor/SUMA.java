package pl.wiktor;

import java.util.*;
import java.lang.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class SUMA {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int result = 0;
        while ((input = br.readLine()) != null) {
            int next_number = Integer.valueOf(input);
            result += next_number;
            System.out.println(result);
        }
    }
}