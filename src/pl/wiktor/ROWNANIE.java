package pl.wiktor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class ROWNANIE {
    public static void main(String[] args) throws IOException {
        double a;
        double b;
        double c;
        double delta;

        BufferedReader buf_reader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";

        while ((str = buf_reader.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(str);

            a = Double.valueOf(tokenizer.nextToken());
            b = Double.valueOf(tokenizer.nextToken());
            c = Double.valueOf(tokenizer.nextToken());

            delta = Math.pow(b, 2) - 4 * (a * c);

            if (delta > 0) {
                System.out.println("2");
            } else if (delta == 0) {
                System.out.println("1");
            } else if (delta < 0) {
                System.out.println("0");
            }

        }

    }
}