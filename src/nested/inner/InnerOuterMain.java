package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner(); // 인스턴스 멤버에 접근 가능하므로, 인스턴스에 접근할 참조값을 알아야한다. 따라서 생성할 때 outer.으로 내부 클래스인 Inner() 클래스를 생성 !
        inner.print();

        System.out.println("innerClass = " + inner.getClass());
    }
}
