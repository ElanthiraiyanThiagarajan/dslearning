package soliddesignpattern.openclosed.usingobjects;

import java.util.ArrayList;
import java.util.List;

public class OpenClosePrincipleMain {

    public static void main(String[] args) {
        List<Geometrics> geometricsList = new ArrayList<>();

        Cuboid c = new Cuboid();
        c.setBreadth(10);
        c.setLength(10);
        c.setHeight(10);

        Sphere sphere = new Sphere();
        sphere.setRadius(5);

        geometricsList.add(c);
        geometricsList.add(sphere);

        System.out.println(new GeoMetricsImplementation().getTotalVolumes(geometricsList));


    }
}
