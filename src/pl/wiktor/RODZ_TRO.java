package pl.wiktor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class RODZ_TRO {
    public static void main(String[] args) throws IOException {

        List<Double> sideList = new ArrayList<Double>();

        BufferedReader buf_reader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";

        while ((str = buf_reader.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(str);
            double triangle_side_I = Double.valueOf(tokenizer.nextToken());
            double triangle_side_II = Double.valueOf(tokenizer.nextToken());
            double triangle_side_III = Double.valueOf(tokenizer.nextToken());

            if ((triangle_side_I > 10000) || (triangle_side_II > 10000) || (triangle_side_III > 10000)) {
                System.exit(0);
            }

            sideList.add(triangle_side_I);
            sideList.add(triangle_side_II);
            sideList.add(triangle_side_III);

            Collections.sort(sideList);

            double short_I = sideList.get(0);
            double short_II = sideList.get(1);
            double long_I = sideList.get(2);

            if ((short_I + short_II) > long_I) {
                if ((Math.pow(short_I, 2) + Math.pow(short_II, 2)) == Math.pow(long_I, 2)) {
                    System.out.println("prostokatny");
                } else if ((Math.pow(short_I, 2) + Math.pow(short_II, 2)) < Math.pow(long_I, 2)) {
                    System.out.println("rozwartokatny");
                } else if ((Math.pow(short_I, 2) + Math.pow(short_II, 2)) > Math.pow(long_I, 2)) {
                    System.out.println("ostrokatny");
                }
                sideList.clear();
            } else {
                System.out.println("brak");
            }
            sideList.clear();
        }

    }
}