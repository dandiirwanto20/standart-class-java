package learn.classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        builder.append("Hello");
        builder.append(" Saya");
        builder.append(" Kucing");
        builder.append(" Bernama");
        builder.append(" Cimi");
        builder.append(" Sugeng");
        builder.append(" Miawwww");

        String name = builder.toString();

        System.out.println(name);
    }
}
