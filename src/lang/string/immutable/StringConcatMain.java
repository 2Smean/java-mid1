package lang.string.immutable;

public class StringConcatMain {

    public static void main(String[] args) {
        String a = "hello"; // x001
        String b = " java"; // x002

        String result1 = a.concat(b);
        String result2 = a + b;
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2); // 특별히 플러스(+)연산자 허용
    }
}
