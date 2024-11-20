package lang.string.test;

public class TestString6 {

    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);
        System.out.println("i = " + index);
        while (index >= 0) { // str에 key가 존재하지 않으면 -1 반환
            index = str.indexOf(key, index + 1);
            count++;
        }
        System.out.println("count = " +count);
    }
}
