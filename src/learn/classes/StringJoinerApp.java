package learn.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        joiner.add("Dandi");
        joiner.add("Cimi");

        String value = joiner.toString();

        System.out.println(value);
    }
}
