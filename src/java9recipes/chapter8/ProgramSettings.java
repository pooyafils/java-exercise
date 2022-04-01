package java9recipes.chapter8;

import java.io.Serializable;
import java.util.Objects;

public class ProgramSettings implements Serializable {
    private static final long serialVersionUID = -1892561327013038124L;
    private int point;
    private int dimension;
    private String color;

    public ProgramSettings(int point, int dimension, String color) {
        this.point = point;
        this.dimension = dimension;
        this.color = color;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProgramSettings that = (ProgramSettings) o;
        return point == that.point &&
                dimension == that.dimension &&
                Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(point, dimension, color);
    }
}
