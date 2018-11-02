package pl.wiktor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FR_08_05 {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        String[] known_colors_names = {"black", "silver", "gray", "white", "maroon", "red", "purple", "fuchsia",
                "green", "lime", "olive", "yellow", "navy", "blue", "teal", "aqua"};

        String[] known_colors = {"#000000", "#C0C0C0", "#808080", "#FFFFFF", "#800000", "#FF0000", "#800080",
                "#FF00FF", "#008000", "#00FF00", "#808000", "#FFFF00", "#000080", "#0000FF", "#008080", "#00FFFF"};

        int how_much_loops = Integer.parseInt(buf.readLine());

        for (int j = 0; j < how_much_loops; j++) {
            String[] tmp = null;
            String last_line = "#";
            tmp = buf.readLine().split(" ");
            for (int i = 0; i < tmp.length; i++) {
                if ((Integer.valueOf(tmp[i]) < 0) || (Integer.valueOf(tmp[i]) > 255)) {
                    System.exit(0);
                } else {
                    last_line += transformData(Integer.valueOf(tmp[i]));
                }
            }

            boolean isTrue = false;

            for (int k = 0; k < known_colors_names.length; k++) {
                if (last_line.equals(known_colors[k])) {
                    System.out.println(known_colors_names[k]);
                    isTrue = true;
                }
            }

            if (!isTrue) {
                System.out.println(last_line);
            }
        }

    }

    public static String transformData(int number) {
        String letter_or_number = "";

        int input_number = number;

        for (int i = 0; i < 2; i++) {

            int division = input_number % 16;

            if (division == 10) {
                letter_or_number += "A";
            } else if (division == 11) {
                letter_or_number += "B";
            } else if (division == 12) {
                letter_or_number += "C";
            } else if (division == 13) {
                letter_or_number += "D";
            } else if (division == 14) {
                letter_or_number += "E";
            } else if (division == 15) {
                letter_or_number += "F";
            } else {
                letter_or_number += String.valueOf(division);
            }

            input_number = input_number / 16;
        }

        letter_or_number = new StringBuffer(letter_or_number).reverse().toString();

        return letter_or_number;
    }

}
