package lang.string.test;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int extIndex = str.indexOf(ext);
        String FileName = str.substring(0, extIndex);
        String EndName = str.substring(extIndex);
        System.out.println("FileName = " + FileName);
        System.out.println("EndName = " + EndName);
    }
}
