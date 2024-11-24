package lang.clazz;

public class ClassCreateMain {

    public static void main(String[] args) throws Exception {
        Class helloClass = Hello.class;
        // Class helloClass = Class.forName("lang.clazz.Hello"); // 사용자가 입력한 정보로 동적으로 객체를 만들 수 있다.

        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance(); // 생성자를 선택하고 선택된 생성자를 기반으로 인스턴스를 생성한다. 
        String result = hello.hello();
        System.out.println("hello = " + hello);
        System.out.println("result = " + result);
    }
}
