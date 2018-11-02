import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AL_14_01 {

    public static void main(String[] args) throws IOException {

        BufferedReader buf_reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> letters = new ArrayList<String>();
        List<Integer> numbers = new ArrayList<Integer>();
        List<Integer> percent_values = new ArrayList<Integer>();

        addLetters(letters);
        addNumbers(numbers);
        addNumbers(percent_values);

        String inputLine = buf_reader.readLine();

        if ((inputLine.length() < 1) || (inputLine.length() > 1000000)) {
            System.exit(0);
        }

        for (int i = 0; i < inputLine.length(); i++) {

            String one_letter = inputLine.substring(i, i + 1).toUpperCase();

            if (letters.contains(one_letter)) {
                int index_of_letter = letters.indexOf(one_letter);
                int number = numbers.get(index_of_letter);
                number++;
                numbers.set(index_of_letter, number);
            }
        }
        countAllLetters(numbers, percent_values);
        printResult(letters, percent_values);

    }

    public static void addLetters(List<String> list) {
        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
                "S", "T", "U", "V", "W", "X", "Y", "Z"};
        for (String letter : letters) {
            list.add(letter);
        }
    }

    public static void addNumbers(List<Integer> list) {
        for (int i = 0; i < 26; i++) {
            list.add(0);
        }
    }

    public static void countAllLetters(List<Integer> listValues, List<Integer> percentValues) {

        double allValues = 0;

        for (int i = 0; i < listValues.size(); i++) {
            allValues += listValues.get(i);
        }

        for (int i = 0; i < listValues.size(); i++) {
            double percent_value = Math.round((listValues.get(i) / allValues) * 100);
            int percent_int = (int) percent_value;
            percentValues.set(i, percent_int);
        }

    }

    public static void printResult(List<String> letters, List<Integer> percentValues) {

        for (int i = 0; i < letters.size(); i++) {
            String resultLine = "";
            resultLine = letters.get(i);
            int how_much_stars = percentValues.get(i);
            for (int j = 0; j < how_much_stars; j++) {
                resultLine += "*";
            }
            System.out.println(resultLine);
        }
    }

}