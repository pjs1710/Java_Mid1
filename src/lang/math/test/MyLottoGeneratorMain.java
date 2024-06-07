package lang.math.test;

public class MyLottoGeneratorMain {

    public static void main(String[] args) {
        MyLottoGenerator generator = new MyLottoGenerator();
        int[] lotto = generator.generate();

        System.out.print("로또 번호 : ");
        for (int i : lotto) {
            System.out.print(i + " ");
        }
    }
}
