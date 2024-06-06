package lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] split = email.split("@");
        System.out.println("ID : " + split[0]);
        System.out.println("DOMAIN : " + split[1]);
    }
}
