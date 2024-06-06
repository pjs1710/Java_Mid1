package lang.string.test;

public class TestString1 {

    public static void main(String[] args) {
        String url = "https://www.example.com";

        boolean bool = url.startsWith("https://");
        System.out.println(bool);
    }
}
