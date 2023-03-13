import java.util.Locale;

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
        return "Boki trójkąta to: %.2f , %.2f , %.2f".formatted(a, b, c);
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
        System.out.println("Pole: %.2f".formatted(this.calculateAREA()));
        System.out.println("Obwód: %.2f".formatted(this.calculatePerimeter()));
    }
}
