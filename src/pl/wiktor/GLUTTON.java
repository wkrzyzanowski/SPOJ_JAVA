package pl.wiktor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GLUTTON {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader buf_reader = new BufferedReader(new InputStreamReader(System.in));
        int how_much_loops = Integer.parseInt(buf_reader.readLine());
        if (how_much_loops < 0)
            System.exit(0);
        String tmp[];
        for (int j = 0; j < how_much_loops; j++) {
            tmp = buf_reader.readLine().split(" ");
            int eaters_number = Integer.parseInt(tmp[0]);
            if ((eaters_number < 1) & (eaters_number > 10000))
                System.exit(0);
            int cookie_box_size = Integer.parseInt(tmp[1]);
            if ((cookie_box_size < 1) & (cookie_box_size > 1000000000))
                System.exit(0);
            int time_of_eat = 0;
            int how_much_cookies = 0;
            for (int i = 0; i < eaters_number; i++) {
                time_of_eat = Integer.parseInt(buf_reader.readLine());
                how_much_cookies += Math.ceil(86400 / time_of_eat);
            }

            if ((how_much_cookies % cookie_box_size) == 0) {
                System.out.println(how_much_cookies / cookie_box_size);
            } else {
                System.out.println(how_much_cookies / cookie_box_size + 1);
            }

        }
        buf_reader.close();
    }

}