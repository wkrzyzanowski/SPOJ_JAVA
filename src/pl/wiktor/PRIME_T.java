package pl.wiktor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

class PRIME_T {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int listSize = 100000;
        int sqrt_listSize = (int) Math.sqrt(listSize);
        int n;
        int loop = 1;
        int input;
        int number = 2;

        HashSet<Integer> primeNumbers = new HashSet<>();

        for (int p = 2; p < listSize; p++) {

            primeNumbers.add(p);
        }
        for (int j = 2; j <= sqrt_listSize; j++) {
            for (int i = number + j; i <= listSize; i += j) {
                if (primeNumbers.contains(i)) {
                    primeNumbers.remove(i);
                }
            }
            number++;
        }

        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(buf.readLine());

        if (n > 100000) {
            System.exit(0);
        }

        while (loop <= n) {

            input = Integer.parseInt(buf.readLine());

            if (input < 1 || input > 10000) {
                System.exit(0);
            }

            if (primeNumbers.contains(input)) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }

            loop++;
        }

        buf.close();
        System.exit(0);

    }
}