package lang.immutable.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20); // return한 값이 있지만

        System.out.println("obj1 = " + obj1.getValue()); // obj1의 Value는 그대로다
    }
}
