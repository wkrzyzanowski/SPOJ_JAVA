package pl.wiktor;

import java.io.IOException;
import java.util.Scanner;

class PRZEDSZK {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);

        int how_much_loops = scan.nextInt();

        if (how_much_loops <= 20 || how_much_loops >= 1) {
            for (int i = 0; i < how_much_loops; i++) {

                int first_number = scan.nextInt();
                int second_number = scan.nextInt();

                if (first_number > 30 || first_number < 10) {
                    scan.close();
                    System.exit(0);
                }

                if (second_number > 30 || second_number < 10) {
                    scan.close();
                    System.exit(0);
                }

                int which_is_bigger;
                int which_is_smaller;

                if (first_number >= second_number) {
                    which_is_bigger = first_number;
                    which_is_smaller = second_number;
                } else {
                    which_is_bigger = second_number;
                    which_is_smaller = first_number;
                }

                boolean isTrue = false;
                int score;

                while (isTrue == false) {
                    int modulo = 1;
                    modulo = which_is_bigger % which_is_smaller;

                    if (modulo == 0) {
                        isTrue = true;
                        score = which_is_bigger;
                        System.out.println(score);
                        break;
                    } else {

                        if (first_number > second_number) {
                            which_is_bigger += first_number;
                        } else {
                            which_is_bigger += second_number;
                        }
                    }
                }

            }
        } else {
            scan.close();
            System.exit(0);
        }

        scan.close();
    }
}