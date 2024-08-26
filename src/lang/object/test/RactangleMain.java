package lang.object.test;

public class RactangleMain {

    public static void main(String[] args) {
        Ractangle rect1 = new Ractangle(100, 20);
        Ractangle rect2 = new Ractangle(100, 20);

        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect1 == rect2);
        System.out.println(rect1.equals(rect2));
    }
}
