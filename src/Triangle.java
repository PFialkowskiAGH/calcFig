public class Triangle extends Figure implements Printable {
    double a, b, c;

    //constructor
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString()
    {
        return "Trójkąt o bokach: %.2f , %.2f , %.2f".formatted(a, b, c);
    }

    //P=p(p−a)(p−b)(p−c)−−−−−−−−−−−−−−−−−√
    @Override
    double calculateAREA() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public void print() {
        System.out.println(this);
        System.out.printf("Pole: %.2f%n", this.calculateAREA());
        System.out.printf("Obwód: %.2f%n", this.calculatePerimeter());
    }
}
