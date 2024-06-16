package soliddesignpattern.openclosed.usingobjects;

public class Sphere extends Geometrics{

    public double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
         return (4 / 3) * Math.PI * radius * radius * radius;
    }
}
