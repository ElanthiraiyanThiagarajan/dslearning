package soliddesignpattern.openclosed.usingobjects;

import java.util.List;

public class GeoMetricsImplementation {

    public double getTotalVolumes(List<Geometrics> geometricsList){
        int totalVolume =0 ;
        for(Geometrics geometrics:geometricsList){
            totalVolume += geometrics.getVolume();
        }
        return totalVolume;
    }
}
