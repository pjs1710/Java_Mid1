package enumeration.ex2;

public class ClassGrade {

    // 타입 안전 열거형 패턴
    public static final ClassGrade BASIC = new ClassGrade(); // x001
    public static final ClassGrade GOLD = new ClassGrade(); // x002
    public static final ClassGrade DIAMOND = new ClassGrade(); // x003

    // private 생성자 추가
    private ClassGrade() {}

    // 클래스 정의 후 해당 클래스 타입만 쓰도록 나열한 후 외부 클래스에서 생성하지 못하게 막는 패턴
}
