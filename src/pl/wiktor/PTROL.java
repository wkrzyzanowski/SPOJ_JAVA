package pl.wiktor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PTROL {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader buf_reader = new BufferedReader(new InputStreamReader(System.in));

        int how_much_loops = Integer.parseInt(buf_reader.readLine());

        if ((how_much_loops < 0) || (how_much_loops > 100)) {
            System.exit(0);
        }

        String[] tmp = null;
        for (int i = 0; i < how_much_loops; i++) {

            tmp = buf_reader.readLine().split(" ");

            String how_many_numbers = tmp[0];

            if ((Integer.parseInt(how_many_numbers) < 1) || (Integer.parseInt(how_many_numbers) > 100)) {
                System.exit(0);
            }

            String moving_number = tmp[1];

            for (int j = 2; j <= Integer.parseInt(how_many_numbers); j++) {
                System.out.print(tmp[j] + " ");
            }

            System.out.print(moving_number + "\n");

        }

    }

}