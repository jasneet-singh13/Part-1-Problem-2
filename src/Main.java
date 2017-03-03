import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");

        String name = scanner.next();
        System.out.println("Hi, " + name + ". How are you?");
    }
}
