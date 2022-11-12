package ders11;

public class replace {
    public static void main(String[] args) {
        String input = "ja5+va cok 1*guzel";
        input = input.replaceAll("\\d", "");
        System.out.println(input);
        input = input.replaceAll("\\s", "5");
        System.out.println(input);
        input = input.replaceAll("\\W", "");
        System.out.println(input);
        input = input.replaceAll("\\d", " ");


        System.out.println(input);



    }
}