package pl.wiktor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class KC009 {
    public static void main(String[] args) throws IOException {

        List<Character> letterList = new ArrayList<Character>();

        BufferedReader buf_reader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";

        while ((str = buf_reader.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(str);

            String word = tokenizer.nextToken();

            int how_much_loops = word.length();

            if (how_much_loops > 1000) {
                System.exit(0);
            }

            for (int i = 0; i < how_much_loops; i++) {
                letterList.add(word.charAt(i));
            }

            Collections.reverse(letterList);

            for (int j = 0; j < letterList.size(); j++) {
                System.out.print(letterList.get(j));
            }

            System.out.print("\n");

            letterList.clear();


        }

        buf_reader.close();

    }
}