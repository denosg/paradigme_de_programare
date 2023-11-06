package lab_5_prob_2;

public class RightAngle implements GeometryFigure{
    private double lat;
    private double lung;

    public RightAngle(double lat, double lung) {
        this.lat = lat;
        this.lung = lung;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLung() {
        return lung;
    }

    public void setLung(double lung) {
        this.lung = lung;
    }

    @Override
    public double getArie() {
        return lat * lung;
    }

    @Override
    public double getPerimetru() {
        return lat * 2 + lung * 2;
    }

    @Override
    public String toString() {
        return "RightAngle{" +
                "lat=" + lat +
                ", lung=" + lung +
                '}';
    }
}
