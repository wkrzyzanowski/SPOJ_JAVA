package pl.wiktor;

import java.util.Scanner;

class FCTRL3 {
    public static void main(String[] args) {

        int how_much_loops;
        int input;

        Scanner scan = new Scanner(System.in);

        how_much_loops = scan.nextInt();

        if ((how_much_loops < 1) || how_much_loops > 30) {
            scan.close();
            System.exit(0);
        } else {
            for (int i = 0; i < how_much_loops; i++) {
                input = scan.nextInt();

                if (input < 0 || input > 1000000000) {
                    scan.close();
                    System.exit(0);
                } else {
                    if ((input != 0) & (input < 10)) {

                        int score = 1;

                        for (int j = 1; j <= input; j++) {
                            score *= j;
                        }

                        int one_places = score % 10;
                        int decimal_places = (score % 100 - (score % 10)) / 10;

                        System.out.println(decimal_places + " " + one_places);
                    } else if (input == 0) {
                        System.out.println("0 1");
                    } else {
                        System.out.println("0 0");
                    }

                }
            }
            scan.close();
        }
    }
}