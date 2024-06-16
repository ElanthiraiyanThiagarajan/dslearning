package soliddesignpattern.openclosed.usingobjects;

public class Cuboid extends Geometrics {

    private int breadth;
    private int height;
    private int length;

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double getVolume() {
        return length* breadth*height;
    }
}
