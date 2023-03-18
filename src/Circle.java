public class Circle extends Figure implements Printable {
    double r;

    //constructor
    public Circle(double r) { this.r = r; }

    @Override
    public String toString()
    {
        return "Okrąg o promieniu: %.2f".formatted(r);
    }

    @Override
    double calculateAREA() { return Math.pow(r,2) * Math.PI; }

    @Override
    double calculatePerimeter() { return 2 * r * Math.PI; }

    @Override
    public void print() {
        System.out.println(this);
        System.out.printf("Pole: %.2f%n", this.calculateAREA());
        System.out.printf("Obwód: %.2f%n", this.calculatePerimeter());
    }
}
