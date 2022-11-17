package ders37;

public class Throw5 {
    public static void main(String[] args) {

        try {

            çalış();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

    private static void çalış() {

        throw new RuntimeException("Çoook çalış");

    }
}
