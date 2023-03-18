import java.util.Scanner;

public interface UserInterface {
    Scanner scanner = new Scanner(System.in);
    void startInterface();
    void scanMenuOptions();
    void endInterface();
    default void consoleEnter(){
        System.out.printf("Naciśnij enter, by kontynuować ...");
        scanner.nextLine();
        scanner.nextLine();
        System.out.printf("\n");};
}
