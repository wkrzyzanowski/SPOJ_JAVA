package pl.wiktor;

import java.util.*;
import java.lang.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

class STOS {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        int maxStosSize = 10;

        Deque<String> stos = new LinkedList<>();
        while ((input = br.readLine()) != null) {


            switch (input) {
                case "-":
                    if (!stos.isEmpty()) {
                        System.out.println(((LinkedList<String>) stos).get(0));
                        ((LinkedList<String>) stos).remove(0);
                    } else {
                        System.out.println(":(");
                    }
                    break;
                case "+":
                    String nextLine = br.readLine();
                    if (stos.size() != maxStosSize) {
                        stos.addFirst(nextLine);
                        System.out.println(":)");
                    } else {
                        System.out.println(":(");
                    }
                    break;

            }

        }
    }
}