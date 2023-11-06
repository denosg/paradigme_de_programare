package lab_5_prob_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<GeometryFigure> listOfGeometryFigures = new ArrayList<>();
        Square square = new Square(10);
        RightAngle rightAngle = new RightAngle(10, 5);
        listOfGeometryFigures.add(square);
        listOfGeometryFigures.add(rightAngle);
        listOfGeometryFigures.stream().map((figure) -> figure.getArie()).forEach(System.out::println);
    }
}
