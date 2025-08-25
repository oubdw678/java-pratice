import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + ", nice to meet you!");
        scanner.close();
    }
}
