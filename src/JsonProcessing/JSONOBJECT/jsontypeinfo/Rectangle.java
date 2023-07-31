package JsonProcessing.JSONOBJECT.jsontypeinfo;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("rectangle")
public class Rectangle extends Shape {
    private int w;
    private int h;

    public Rectangle() {
    }

    public Rectangle(int w, int h) {
        this.w = w;
        this.h = h;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
    public static Rectangle of(int w, int h) {
        Rectangle r = new Rectangle();
        r.setW(w);
        r.setH(h);
        return r;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "w=" + w +
                ", h=" + h +
                '}';
    }
}