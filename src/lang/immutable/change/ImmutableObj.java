package lang.immutable.change;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {
        int result = value + addValue;
        return new ImmutableObj(result); // 새로운 객체를 만들어서 반환. 기존의 인스턴스는 건들 수 없음.(final 불변)
    }

    public int getValue() {
        return value;
    }


}
