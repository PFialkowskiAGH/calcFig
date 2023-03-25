import java.util.Scanner;

public class Triangle extends Figure implements Printable {
    Scanner scanner = new Scanner(System.in);
    double a, b, c;

    //constructor
    public Triangle(double a, double b, double c) {
        while (c >= a + b || b >= a + c || a >= b + c)
        {
            System.out.println("Trójkąt o takich bokach nie istnieje, podaj nowe boki");
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
        }
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
