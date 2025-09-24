package learn.classes;

public class StringApp {
    static void main(String[] args) {
        String name = "Dandi Ir";
        // lowercase
        String nameLowercase = name.toLowerCase();
        System.out.println(name);
        System.out.println(nameLowercase);

        // Uppercase
        String nameUppercase = name.toUpperCase();
        System.out.println(nameUppercase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Dandi"));
        System.out.println(name.endsWith("Ir"));

        String[] names = name.split(" ");
        for (var value : names) {
            System.out.println(value);
        }

        System.out.println(nameUppercase.charAt(1));

        char[] chars = name.toCharArray();
        System.out.println(chars[0]);
    }
}
