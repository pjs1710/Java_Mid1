package enumeration.test;

public class AuthGradeMain1 {

    public static void main(String[] args) {
        AuthGrade[] grades = AuthGrade.values();
        for (AuthGrade grade : grades) {
            printAuthGrade(grade);
        }
    }

    private static void printAuthGrade(AuthGrade authGrade) {
        System.out.println("grade = " + authGrade + ", level = " + authGrade.getLevel() + ", 설명 = " + authGrade.getDescription());
    }
}
