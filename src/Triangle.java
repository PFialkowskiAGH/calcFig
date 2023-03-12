import java.util.Locale;

public class Triangle extends Figure implements Printable
{
    double a, b, c;
    //constructor
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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
        System.out.println(String.format(Locale.US,%.2f %.2f %.2f, a, b, c));
        System.out.println(this.calculateAREA());
        System.out.println(this.calculatePerimeter());
    }
}
