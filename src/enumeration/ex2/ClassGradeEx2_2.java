package enumeration.ex2;

public class ClassGradeEx2_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
/*
        ClassGrade newClassGrade = new ClassGrade(); // 전혀 다른 인스턴스 생성 x009 ,, 컴파일 오류 ! private 생성자를 추가해서 막자!
        int result = discountService.discount(newClassGrade, price);
        System.out.println("newClassGrade 등급의 할인 금액 = " + result);
*/
    }
}
