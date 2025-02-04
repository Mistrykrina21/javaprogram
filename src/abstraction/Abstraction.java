package abstraction;

public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        lion l = new lion();
        l.eat();
        l.walk();

    }
}

abstract class Animal {
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class lion extends Animal {
    void walk() {
        System.out.println("walk on 4 legs");
    }
}
