package pl.wiktor;

import java.lang.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class AL_28_01 {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int howManyCalculations = (int) Math.ceil(Double.valueOf(br.readLine()) / 2);
        String input = br.readLine();
        String[] wyrazy = new String[howManyCalculations];
        wyrazy[0] = input;
        int poczatek = 0;
        int koniec = input.length() - 1;
        for (int i = 1; i < howManyCalculations; i++) {
            StringBuilder builder1 = new StringBuilder(input);
            builder1.setCharAt(poczatek, '.');
            builder1.setCharAt(koniec, '.');
            poczatek++;
            koniec--;
            wyrazy[i] = builder1.toString();
            input = builder1.toString();
        }


        for (int i = wyrazy.length - 1; i >= 0; i--) {
            System.out.println(wyrazy[i]);
        }

    }
}