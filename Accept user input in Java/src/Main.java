import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //user input
        System.out.println("What is your name?");
        String name = scanner.nextLine();


        System.out.println("How old are you?");
        int age = scanner.nextInt();


        scanner.nextLine(); //this extra next line removes the /n from last input
        System.out.println("What is your fav food?");
        String food = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("Your are " + age + " Years old!");
        System.out.println("You like " + food);
    }
}
