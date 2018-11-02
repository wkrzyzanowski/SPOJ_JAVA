package pl.wiktor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class TABLICA {
    public static void main(String[] args) throws IOException {
        List<Integer> numbersList = new ArrayList<Integer>();

        BufferedReader buf_reader = new BufferedReader(new InputStreamReader(System.in));
        String str = buf_reader.readLine();

        StringTokenizer tokenizer = new StringTokenizer(str);

        int how_much_loops = tokenizer.countTokens();

        for (int i = 0; i < how_much_loops; i++) {
            int element = Integer.valueOf(tokenizer.nextToken());
            numbersList.add(element);
        }

        Collections.reverse(numbersList);

        for (int j = 0; j < numbersList.size() - 1; j++) {
            System.out.print(numbersList.get(j) + " ");
        }

        System.out.print(numbersList.get(numbersList.size() - 1));

        numbersList.clear();

        buf_reader.close();

    }
}