package nested.anonymous.ex;

import java.util.Random;

public class MyRefMainLamda {

    public static void dice() {
        System.out.println("주사위 굴리기 시작(1~6)");
        int diceNum = new Random().nextInt(6) + 1;
        System.out.println("나온 주사위는 : " + diceNum);
        System.out.println("주사위 다 굴림 !");
    }

    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        dice();
        System.out.println("프로그램 종료");
    }
}
