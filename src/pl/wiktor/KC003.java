package pl.wiktor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class KC003 {
    public static void main(String[] args) throws IOException {

        List<Double> sideList = new ArrayList<Double>();

        BufferedReader buf_reader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";

        while ((str = buf_reader.readLine()) != null) {
            StringTokenizer tokenizer = new StringTokenizer(str);
            double triangle_side_I = Double.valueOf(tokenizer.nextToken());
            ;
            sideList.add(triangle_side_I);
            double triangle_side_II = Double.valueOf(tokenizer.nextToken());
            ;
            sideList.add(triangle_side_II);
            double triangle_side_III = Double.valueOf(tokenizer.nextToken());
            ;
            sideList.add(triangle_side_III);

            Collections.sort(sideList);

            double short_I = sideList.get(0);
            double short_II = sideList.get(1);
            double long_I = sideList.get(2);

            if ((short_I + short_II) > long_I) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }

            sideList.clear();

        }


    }
}