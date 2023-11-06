package lab_5_prob_2;

public class Square implements GeometryFigure{
    private double lat;

    public Square(int lat) {
        this.lat = lat;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    @Override
    public double getArie() {
        return lat * lat;
    }

    @Override
    public double getPerimetru() {
        return lat * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "lat=" + lat +
                '}';
    }
}
