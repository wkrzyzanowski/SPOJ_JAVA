package pl.wiktor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class JPESEL {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> pesel_numbers = new ArrayList<Integer>();

        if (!scan.hasNextInt()) {
            scan.close();
            System.exit(0);
        }

        int how_much_tests = scan.nextInt();

        if ((how_much_tests > 100) || (how_much_tests < 0)) {
            scan.close();
            System.exit(0);
        }

        for (int t = 0; t < how_much_tests; t++) {

            String pesel_string = scan.next();

            if (pesel_string.length() != 11) {
                scan.close();
                System.exit(0);
            }

            for (int i = 0; i < pesel_string.length(); i++) {
                String sub_string = pesel_string.substring(i, i + 1);
                pesel_numbers.add(Integer.valueOf(sub_string));
            }

            int number_one = pesel_numbers.get(0) * 1;
            int number_two = pesel_numbers.get(1) * 3;
            int number_three = pesel_numbers.get(2) * 7;
            int number_four = pesel_numbers.get(3) * 9;
            int number_five = pesel_numbers.get(4) * 1;
            int number_six = pesel_numbers.get(5) * 3;
            int number_seven = pesel_numbers.get(6) * 7;
            int number_eight = pesel_numbers.get(7) * 9;
            int number_nine = pesel_numbers.get(8) * 1;
            int number_ten = pesel_numbers.get(9) * 3;
            int number_eleven = pesel_numbers.get(10) * 1;

            int pesel_sum = number_one + number_two + number_three + number_four + number_five + number_six
                    + number_seven + number_eight + number_nine + number_ten + number_eleven;

            if (pesel_sum > 0) {
                String string_pesel_sum = String.valueOf(pesel_sum);
                String last_number_of_pesel = string_pesel_sum.substring(string_pesel_sum.length() - 1);

                if (last_number_of_pesel.equals("0")) {
                    System.out.println("D");
                } else {
                    System.out.println("N");
                }

            } else {
                System.out.println("N");
            }

            pesel_numbers.clear();
        }
    }
}