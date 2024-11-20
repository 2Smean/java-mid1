package lang.string.test;

public class TestString4 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String fileName = str.substring(0, 5);
        String endName = str.substring(5, 9);
        System.out.println("substring = " + fileName);
        System.out.println("fileName = " + endName);
    }
}
