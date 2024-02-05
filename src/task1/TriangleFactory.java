package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TriangleFactory{

    public Triangle create(Double sideA, Double sideB, Double sideC){
        List<Double> sides = new ArrayList<>(3);
        sides.add(sideA);
        sides.add(sideB);
        sides.add(sideC);
        Collections.sort(sides);

        if (sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2))) {
            return new Triangle.Equilateral(sides.get(0));
        }
        else if (sides.get(1).equals(sides.getLast())) {
            return new Triangle.Isosceles(sides.get(0), sides.get(1));
        }
        else if (checkRightAngeled(sides.get(0), sides.get(1), sides.get(2))) {
            return new Triangle.RightAngled(sides.get(0), sides.get(1), sides.get(2));
        }
        else
            throw new IllegalArgumentException("wrong sides");
    }
    private boolean checkRightAngeled(double a, double b, double c) {
        return a * a + b * b == c * c;
    }
}
