package pl.wiktor;

import java.util.Scanner;

class PP0501A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int how_much_loops = scan.nextInt();

        for (int i = 0; i < how_much_loops; i++) {

            int a = scan.nextInt();
            int b = scan.nextInt();

            if ((a < 0) || (a > 1000000)) {
                System.exit(0);
            } else if ((b < 0) || (b > 1000000)) {
                System.exit(0);
            } else {
                int nwd_score = nwd(a, b);
                System.out.println(nwd_score);
            }
        }
        scan.close();
    }

    public static int nwd(int a, int b) {
        int nwd_score = 0;

        for (int i = 1; i < 1000; i++) {
            if ((a % i == 0) & (b % i == 0)) {
                nwd_score = i;
            }
        }
        return nwd_score;
    }
}