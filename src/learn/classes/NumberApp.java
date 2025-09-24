package learn.classes;

public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        String contoh = "10000";
        Integer contohInt = Integer.valueOf(contoh);
        System.out.println(contohInt);

        String contoh1 = "10.10";

        Double contohDouble = Double.valueOf(contoh1);
        System.out.println(contohDouble);

    }
}
