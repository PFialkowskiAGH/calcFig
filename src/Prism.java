public class Prism extends Figure implements Printable {
    double H;
    Figure base;

    //constructor
    public Prism(Figure base, double H) {
        this.H = H;
        this.base = base;
    }

    @Override
    public String toString()
    {
        return "Graniastosłup prawidłowy:\n Wysokość: %.2f\n Podstawa: %s".formatted(H, this.base.toString());
    }

    @Override
    double calculateAREA() { return this.base.calculateAREA() * H; }

    @Override
    double calculatePerimeter() { return 2 * this.base.calculateAREA() + this.base.calculatePerimeter() * H; }

    @Override
    public void print() {
        System.out.println(this);
        System.out.printf("Pole: %.2f%n", this.calculateAREA());
        System.out.printf("Obwód: %.2f%n", this.calculatePerimeter());
    }
}
