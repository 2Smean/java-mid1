package lang.immutable.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20); // 불변객체를 다룰 때에는 반환값을 받아서 출력해야 한다.

        //계산 이후에도 기존값과 신규값 모두 확인 가능
        System.out.println("obj1 = " + obj1.getValue());
    }
}
