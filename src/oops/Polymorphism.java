package oops;


// method overloading
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("calc.sum: " + calculator.add(10, 20));
        System.out.println("calc.sum: " + calculator.add(10, 20, 30));
        System.out.println("calc.sum: " + calculator.add(10.5, 20.5));

        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myDog.sound();
        myCat.sound();
    }
}

// Method overriding

class Animal {
    // Method in parent class
    public void sound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("The cat meows");
    }
}



