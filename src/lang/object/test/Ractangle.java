package lang.object.test;

import java.util.Objects;

public class Ractangle {
    private int width;
    private int height;

    public Ractangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Ractangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Ractangle ractangle = (Ractangle) object;
        return width == ractangle.width && height == ractangle.height;
    }
}
