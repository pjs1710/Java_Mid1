package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException { // call을 호출한 곳으로 폭탄 던지기
        // 문제 상황 발생 !
        throw new MyCheckedException("ex"); // 폭탄 발생
    }
}
