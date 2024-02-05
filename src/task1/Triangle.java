package task1;

public interface Triangle extends Figure {
    public  String getType();

    class Equilateral implements Triangle {
        protected final double a;

        public Equilateral(double side) {
            this.a = side;
        }

        @Override
        public double area() {
            return (a * a * Math.sqrt(3)) / 4;
        }

        @Override
        public String getType() {
            return "Equilateral";
        }
    }

    class Isosceles extends Equilateral {
        protected final double b;

        public Isosceles(double base, double hip) {
            super(base);
            this.b = hip;
        }

        @Override
        public double area() {
            return a * getHeight() / 2;
        }

        @Override
        public String getType() {
            return "Isosceles";
        }

        public double getHeight() {
            return Math.sqrt(b * b - Math.pow(a / 2, 2));
        }

        public boolean checkIsosceles(Double sideA, Double sideB, Double sideC) {
            return (!sideA.equals(sideB)) && (sideB.equals(sideC));
        }
    }

    class RightAngled extends Isosceles {
        protected final double c;

        public RightAngled(double firstCathetus, double secondCathetus, double hypotenuse) {
            super(firstCathetus, secondCathetus);
            this.c = hypotenuse;
        }

        @Override
        public double area() {
            return checkRightAngeled(a, b, c) ?
                    (a * b / 2) : 0;
        }


        private boolean checkRightAngeled(double a, double b, double c) {
            return a * a + b * b == c * c;
        }
        @Override
        public String getType() {
            return "RightAngled";
        }

    }
}
