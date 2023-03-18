public class FigureCalcInterface implements UserInterface{
    @Override
    public void startInterface() {
        System.out.printf("Witaj w kalkulatorze figur :)\n");
    }

    @Override
    public void scanMenuOptions() {
        System.out.printf("Wybierz, która figura cię interesuje:\n");
        System.out.printf("1 - Okrąg\n");
        System.out.printf("2 - Kwadrat\n");
        System.out.printf("3 - Trójkąt\n");
        System.out.printf("4 - Graniastosłup prawidłowy\n");
        System.out.printf("5 - Zakończ działanie kalkulatora figur\n");
        switch (scanner.nextInt()) {
            case 1 -> scanAndShowCircle();
            case 2 -> scanAndShowSquare();
            case 3 -> scanAndShowTriangle();
            case 4 -> scanAndShowPrism();
            case 5 -> { return; }
            default -> {
                System.out.printf("Nie podano prawidłowego wyboru, wybierz liczbę od 1 do 5");
                System.out.printf("\n");
            }
        }
        scanMenuOptions();
    }

    @Override
    public void endInterface() {
        System.out.printf("Do następnego!\n");
    }

    public void scanAndShowCircle()
    {
        System.out.printf("Wybrałeś okrąg, podaj promień:\n");
        Circle userCircle = new Circle(scanner.nextInt());
        userCircle.print();
        System.out.printf("\n");
    }
    public void scanAndShowSquare()
    {
        System.out.printf("Wybrałeś kwadrat, podaj bok:\n");
        Square userSquare = new Square(scanner.nextInt());
        userSquare.print();
        System.out.printf("\n");
    }
    public void scanAndShowTriangle()
    {
        System.out.printf("Wybrałeś trójkąt, podaj boki:\n");
        Triangle userTriangle = new Triangle(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        userTriangle.print();
        System.out.printf("\n");
    }
    public void scanAndShowPrism()
    {
        System.out.printf("Wybrałeś Graniastosłup prawidłowy, wybierz figurę w podstawie:\n");
        System.out.printf("1 - Okrąg\n");
        System.out.printf("2 - Kwadrat\n");
        System.out.printf("3 - Trójkąt\n");
        Figure userBase = scanBase();
        System.out.printf("Podaj wysokość graniastosłupa:\n");
        Prism userPrism = new Prism(userBase, scanner.nextInt());
        userPrism.print();
        System.out.printf("\n");
    }
    public Figure scanBase()
    {
        Figure userBase = null;
        boolean isSet = false;
        while (!isSet)
        {
            switch(scanner.nextInt())
            {
                case 1:
                    System.out.printf("Wybrałeś okrąg, podaj promień:\n");
                    userBase = new Circle(scanner.nextInt());
                    isSet = true;
                    break;
                case 2:
                    System.out.printf("Wybrałeś kwadrat, podaj bok:\n");
                    userBase = new Square(scanner.nextInt());
                    isSet = true;
                    break;
                case 3:
                    System.out.printf("Wybrałeś trójkąt, podaj boki:\n");
                    userBase = new Triangle(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
                    isSet = true;
                    break;
                default:
                    System.out.printf("Nie podano prawidłowego wyboru, wybierz liczbę od 1 do 3\n");
                    break;
            }
        }
        return userBase;
    }
}
