package lang.System;

import java.util.Arrays;

public class SystemMain {

    public static void main(String[] args) {
        // 현재 시간(밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        // 현재 시간(나노초)를 가져온다. 
        long currentNano = System.nanoTime();
        System.out.println("currentNano = " + currentNano);

        // 환경 변수를 읽는다. (운영체제가 사용)
        System.out.println("getenv = " + System.getenv());

        // 시스템 속성을 읽는다. (Java가 사용)
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version: " + System.getProperty("java.version"));

        // 배열을 고속으로 복사한다.
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length); // 루프를 도는 것이 아닌 운영체제에서 통째로 복사

        // 배열 출력
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("Arrays.toString = " + Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(0); // 가급적이면 사용하지 않는것이 좋다
    }
}
