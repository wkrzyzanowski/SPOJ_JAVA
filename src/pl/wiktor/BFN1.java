package pl.wiktor;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BFN1 {

    public static void main(String[] args) throws Exception {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int howManyCalculations = Integer.valueOf(br.readLine());
        String input;
        int iterations = 0;
        while ((input = br.readLine()) != null) {

            int number = Integer.valueOf(input);
            int reverse = Integer.valueOf(new StringBuilder(input).reverse().toString());


            int operations = 0;
            int result = number;
            while (result != reverse) {
                result = number + reverse;
                reverse = Integer.valueOf(new StringBuilder(String.valueOf(result)).reverse().toString());
                number = result;
                operations++;
            }

            System.out.println(result + " " + operations);


            iterations++;
            if (iterations == howManyCalculations) {
                break;
            }
        }

    }
}
