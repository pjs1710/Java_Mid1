package lang.wrapper.test;

public class WrapperTest2 {

    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};
        double sum = 0;
        for (String num : array) {
            sum += Double.parseDouble(num);
        }

        System.out.println("sum = " + sum);
    }
}
