package lang.immutable;

public class StringImmutable2 {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat("java"); // String은 불변 객체
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
