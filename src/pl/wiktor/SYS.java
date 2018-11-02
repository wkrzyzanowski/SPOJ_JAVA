package pl.wiktor;

import java.util.*;
import java.lang.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class SYS {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int howManyCalculations = Integer.valueOf(br.readLine());
        String input;
        int iterations = 0;


        while ((input = br.readLine()) != null) {

            int number = Integer.valueOf(input);

            String hex = decToHex(number);
            System.out.print(hex);
            String elex = decToElex(number);
            System.out.print(" " + elex);
            System.out.print("\n");

            iterations++;
            if (iterations == howManyCalculations) {
                break;
            }
        }
    }

    private static String decToElex(int number) {
        String elex = "";
        String[] elex_array = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A"};
        int liczba = number;
        while (liczba != 0) {
            int index = liczba / 11;
            int modulo = liczba % 11;
            elex += elex_array[modulo];
            liczba = index;
        }

        return new StringBuilder(elex).reverse().toString();
    }

    private static String decToHex(int number) {
        String hex = "";
        String[] hex_array = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        int liczba = number;
        while (liczba != 0) {
            int index = liczba / 16;
            int modulo = liczba % 16;
            hex += hex_array[modulo];
            liczba = index;
        }

        return new StringBuilder(hex).reverse().toString();
    }
}