package nested.anonymous.ex;

public class MyRefMain {

    public static void sum() {
        int a = 1;
        int b = 2;
        System.out.println("프로그램 시작");
        System.out.println("두 수의 합 : " + (a + b));
        System.out.println("프로그램 종료");
    }

    public static void sub() {
        int a = 1;
        int b = 2;
        System.out.println("프로그램 시작");
        System.out.println("두 수의 차 : " + (a - b));
        System.out.println("프로그램 종료");
    }

    public static void calc(int a, int b) {
        System.out.println("프로그램 시작");
        System.out.println("두 수의 합 : " + (a + b));
        System.out.println("두 수의 차 : " + (a - b));
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        calc(1, 2);
    }
}
