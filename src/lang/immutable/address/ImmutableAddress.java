package lang.immutable.address;
/*Immutable : 불변의*/
public class ImmutableAddress {

    private final String value; //생성자를 통해 값이 한번 세팅되면 변경 불가

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
