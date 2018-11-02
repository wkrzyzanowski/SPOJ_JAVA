package pl.wiktor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class CALC {
    public static void main(String[] args) throws IOException {

        BufferedReader buf_reader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";

        while ((str = buf_reader.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(str);
            String currentSign = tokenizer.nextToken();
            int firstNumber;
            int secondNumber;
            int result;

            switch (currentSign) {
                case "+":
                    firstNumber = Integer.valueOf(tokenizer.nextToken());
                    secondNumber = Integer.valueOf(tokenizer.nextToken());
                    result = firstNumber + secondNumber;
                    System.out.println(result);
                    break;
                case "-":
                    firstNumber = Integer.valueOf(tokenizer.nextToken());
                    secondNumber = Integer.valueOf(tokenizer.nextToken());
                    result = firstNumber - secondNumber;
                    System.out.println(result);
                    break;
                case "*":
                    firstNumber = Integer.valueOf(tokenizer.nextToken());
                    secondNumber = Integer.valueOf(tokenizer.nextToken());
                    result = firstNumber * secondNumber;
                    System.out.println(result);
                    break;
                case "/":
                    firstNumber = Integer.valueOf(tokenizer.nextToken());
                    secondNumber = Integer.valueOf(tokenizer.nextToken());
                    result = firstNumber / secondNumber;
                    System.out.println(result);
                    break;
                case "%":
                    firstNumber = Integer.valueOf(tokenizer.nextToken());
                    secondNumber = Integer.valueOf(tokenizer.nextToken());
                    result = firstNumber % secondNumber;
                    System.out.println(result);
                    break;
            }

        }

    }
}