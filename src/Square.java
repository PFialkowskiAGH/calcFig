public class Square extends Figure implements Printable {
    double a;

    //constructor
    public Square(double a) {
        this.a = a;
    }

    @Override
    public String toString()
    {
        return "Kwadrat o boku: %.2f".formatted(a);
    }

    @Override
    double calculateAREA() { return a * a; }

    @Override
    double calculatePerimeter() { return 4 * a; }

    @Override
    public void print() {
        System.out.println(this);
        System.out.printf("Pole: %.2f%n", this.calculateAREA());
        System.out.printf("Obwód: %.2f%n", this.calculatePerimeter());
    }
}
