package bandwidthcalculator;

import javax.persistence.Entity;

@Entity
public class PacketSizeCalculator {

    private float band;

    public PacketSizeCalculator(float band) {
        this.band = band;
    }

    public Float getBand() {
        return band;
    }
}
