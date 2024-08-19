package lang.object;

public class Child extends Parent{//명시적으로 상속받으면 묵시적 Object 상속받지 않는다

    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}
