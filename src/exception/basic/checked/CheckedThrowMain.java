package exception.basic.checked;

public class CheckedThrowMain {

    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.catchThrow(); // 폭탄이 main 메서드 밖으로 나가버림. 아래 코드는 실행 X
        System.out.println("정상 종료");
    }
}
