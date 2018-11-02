package pl.wiktor;

import java.util.*;
import java.io.*;

public class CALC2 {
    public static void main(String[] args) throws IOException {

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[10];

        String str = "";

        while ((str = buf.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(str);

            String sign = tokenizer.nextToken();

            int numberOne;
            int numberTwo;
            int score;

            switch (sign) {
                case "z":
                    numberOne = Integer.valueOf(tokenizer.nextToken());
                    numbers[numberOne] = Integer.valueOf(tokenizer.nextToken());
                    break;
                case "+":
                    numberOne = numbers[Integer.valueOf(tokenizer.nextToken())];
                    numberTwo = numbers[Integer.valueOf(tokenizer.nextToken())];
                    score = numberOne + numberTwo;
                    System.out.println(score);
                    break;
                case "-":
                    numberOne = numbers[Integer.valueOf(tokenizer.nextToken())];
                    numberTwo = numbers[Integer.valueOf(tokenizer.nextToken())];
                    score = numberOne - numberTwo;
                    System.out.println(score);
                    break;
                case "/":
                    numberOne = numbers[Integer.valueOf(tokenizer.nextToken())];
                    numberTwo = numbers[Integer.valueOf(tokenizer.nextToken())];
                    score = numberOne / numberTwo;
                    System.out.println(score);
                    break;
                case "*":
                    numberOne = numbers[Integer.valueOf(tokenizer.nextToken())];
                    numberTwo = numbers[Integer.valueOf(tokenizer.nextToken())];
                    score = numberOne * numberTwo;
                    System.out.println(score);
                    break;
                case "%":
                    numberOne = numbers[Integer.valueOf(tokenizer.nextToken())];
                    numberTwo = numbers[Integer.valueOf(tokenizer.nextToken())];
                    score = numberOne % numberTwo;
                    System.out.println(score);
                    break;


            }


        }


    }
}