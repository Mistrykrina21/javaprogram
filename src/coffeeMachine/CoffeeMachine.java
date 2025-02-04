package coffeeMachine;

import java.util.Scanner;

// Abstract class for Coffee
abstract class Coffee {
    public abstract void prepare();
}

// Concrete classes for each type of coffee
class Espresso extends Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Espresso...");
        System.out.println("Enjoy your Espresso!");
    }
}

class Cappuccino extends Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Cappuccino...");
        System.out.println("Enjoy your Cappuccino!");
    }
}

class Latte extends Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Latte...");
        System.out.println("Enjoy your Latte!");
    }
}

// Coffee Factory to return the appropriate Coffee object
class CoffeeFactory {
    public static Coffee getCoffee(String choice) {
        if (choice.equals("1")) {
            return new Espresso();
        } else if (choice.equals("2")) {
            return new Cappuccino();
        } else if (choice.equals("3")) {
            return new Latte();
        } else {
            return null; // Invalid selection
        }
    }
}

// Main class to use the Coffee Vending Machine
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Coffee Vending Machine!");
        System.out.println("Please select your coffee:");
        System.out.println("1. Espresso");
        System.out.println("2. Cappuccino");
        System.out.println("3. Latte");
        System.out.print("Enter your choice (1/2/3): ");

        String choice = scanner.nextLine();
        Coffee selectedCoffee = CoffeeFactory.getCoffee(choice);

        if (selectedCoffee != null) {
            selectedCoffee.prepare();
        } else {
            System.out.println("Invalid selection. Please restart and try again.");
        }
    }
}