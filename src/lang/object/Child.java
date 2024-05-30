package lang.object;

public class Child extends Parent { // Parent를 명시적으로 상속받음 -> Object를 상속받지 않는다.

    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}
