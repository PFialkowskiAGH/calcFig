import java.util.Scanner;

public interface UserInterface {
    Scanner scanner = new Scanner(System.in);
    void startInterface();
    void scanMenuOptions();
    void endInterface();
}
