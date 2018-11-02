package pl.wiktor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MWPZ06X {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        int how_much_loops = Integer.parseInt(buf.readLine());

        if ((how_much_loops < 1) || (how_much_loops > 500)) {
            System.exit(0);
        }

        for (int i = 0; i < how_much_loops; i++) {
            int input = Integer.parseInt(buf.readLine());
            if ((input < 1) || (input > 1000)) {
                System.exit(0);
            } else {
                int score = (int) Math.pow(input, 2);
                System.out.println(score);
            }
        }

    }
}