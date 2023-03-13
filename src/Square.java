public class Square extends Figure implements Printable {
    double a;

    //constructor
    public Square(double a) {
        this.a = a;
    }

    @Override
    public String toString()
    {
        return "Bok kwadratu to: %.2f".formatted(a);
    }

    @Override
    double calculateAREA() { return a * a; }

    @Override
    double calculatePerimeter() { return 4 * a; }

    @Override
    public void print() {
        System.out.println(this);
        System.out.println("Pole: %.2f".formatted(this.calculateAREA()));
        System.out.println("Obwód: %.2f".formatted(this.calculatePerimeter()));
    }
}
