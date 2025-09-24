package learn.classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {

        String value = "Dandi Irwanto";
        // rekomendasi untuk hemat memory daripada split
        StringTokenizer tokenizer = new StringTokenizer(value, " ");

        while (tokenizer.hasMoreTokens()) {
            String result = tokenizer.nextToken();
            System.out.println(result);
        }

    }
}
