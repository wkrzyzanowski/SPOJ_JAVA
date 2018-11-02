package pl.wiktor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PP0604A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();
        List<Double> reductionList = new ArrayList<Double>();

        if (!scan.hasNextInt()) {
            scan.close();
            System.exit(0);
        }

        int how_much_loops = scan.nextInt();

        if (how_much_loops > 101) {
            scan.close();
            System.exit(0);
        }

        for (int i = 1; i <= how_much_loops; i++) {

            if (!scan.hasNextInt()) {
                scan.close();
                System.exit(0);
            }

            int how_much_tests = scan.nextInt();

            if ((how_much_tests >= 100) || (how_much_tests == 0)) {
                scan.close();
                System.exit(0);
            }

            double average = 0;
            int currentNumber = 0;

            for (int j = 0; j < how_much_tests; j++) {

                if (!scan.hasNextInt()) {
                    scan.close();
                    System.exit(0);
                }

                currentNumber = scan.nextInt();

                if ((currentNumber < 0) || (currentNumber > 100)) {
                    scan.close();
                    System.exit(0);
                }
                average += currentNumber;
                numbers.add(currentNumber);
            }

            double score = average / how_much_tests;

            double reduction;

            for (int number : numbers) {
                reduction = Math.abs(number - score);
                reductionList.add(reduction);
            }

            if (reductionList.size() == numbers.size()) {

                double search_reduction = 0;
                int index_in_reduction_list;

                for (int j = 0; j < reductionList.size(); j++) {
                    if (j == 0) {
                        search_reduction = reductionList.get(j);
                    }

                    if (reductionList.get(j) < search_reduction) {
                        search_reduction = reductionList.get(j);
                    }
                }

                index_in_reduction_list = reductionList.indexOf(search_reduction);

                System.out.println(numbers.get(index_in_reduction_list));
            }

            reductionList.clear();
            numbers.clear();

        }

        scan.close();

    }
}