package lang.string.builder;

public class StringBuilderMain1_2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // 추가
        String string1 = sb.append("A").append("B").append("C").append("D")
                .insert(4, "Java")
                .delete(4, 8)
                .reverse()
                .toString();

        System.out.println("string1 = " + string1);
    }
}
