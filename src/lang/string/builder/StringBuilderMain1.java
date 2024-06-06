package lang.string.builder;

public class StringBuilderMain1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // 추가
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);
        // 삽입
        sb.insert(4, "Java" );
        System.out.println("insert = " + sb);
        // 삭제
        sb.delete(4, 8);
        System.out.println("delete = " + sb);
        // 뒤집기
        sb.reverse();
        System.out.println("reverse = " + sb);

        // StringBuilder -> String
        // StringBuilder는 가변 >> 쭉 StringBuilder로 가변인 상태로 값을 바꾸다가 마지막에 toString()을 통해서 불변으로 바꾸기
        String string = sb.toString();
        System.out.println("string = " + string);
    }
}
