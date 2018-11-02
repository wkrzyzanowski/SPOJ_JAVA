package pl.wiktor;

import java.util.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PP0602A {
    public static void main(String[] args) throws java.lang.Exception {
        int t;
        int n;
        int count = 1;
        int input;
        List<String> allNumbers = new ArrayList<String>();
        List<Integer> listaN = new ArrayList<Integer>();
        List<Integer> listaInputNIEP = new ArrayList<Integer>();
        List<Integer> listaInputPARZ = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);

        t = scan.nextInt();

        int index = 0;

        while (count <= t) {

            listaInputNIEP.clear();
            listaInputPARZ.clear();

            n = scan.nextInt();
            if (n <= 100) {
                listaN.add(n);
            } else {
                System.exit(0);
            }

            for (int i = 0; i < listaN.get(index); i++) {
                input = scan.nextInt();
                if (i % 2 != 0) {
                    listaInputNIEP.add(input);
                } else if (i % 2 == 0) {
                    listaInputPARZ.add(input);
                }
            }

            String numberString = "";

            for (int k = 0; k < listaInputNIEP.size(); k++) {
                numberString += String.valueOf(listaInputNIEP.get(k)) + " ";
            }

            for (int j = 0; j < listaInputPARZ.size(); j++) {
                numberString += String.valueOf(listaInputPARZ.get(j)) + " ";
            }

            allNumbers.add(numberString);

            listaInputNIEP.clear();
            listaInputPARZ.clear();

            index++;

            count++;
        }

        scan.close();

        for (int h = 0; h < allNumbers.size(); h++) {
            System.out.println(allNumbers.get(h));
        }
    }
}