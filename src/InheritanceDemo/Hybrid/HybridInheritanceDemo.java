package InheritanceDemo.Hybrid;// HybridInheritanceDemo.java

// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Single Inheritance → Animal → Mammal
class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal is walking...");
    }
}

// Multilevel Inheritance → Animal → Mammal → Tiger
class Tiger extends Mammal {
    void roar() {
        System.out.println("Tiger is roaring...");
    }
}

// Hierarchical Inheritance → Animal → Reptile
class Reptile extends Animal {
    void crawl() {
        System.out.println("Reptile is crawling...");
    }
}

// Main class
public class HybridInheritanceDemo {
    public static void main(String[] args) {

        System.out.println("=== Animal Object ===");
        Animal a = new Animal();
        a.eat();

        System.out.println("\n=== Mammal Object (Single Inheritance) ===");
        Mammal m = new Mammal();
        m.eat();     // from Animal
        m.walk();    // from Mammal

        System.out.println("\n=== Tiger Object (Multilevel Inheritance) ===");
        Tiger t = new Tiger();
        t.eat();     // from Animal
        t.walk();    // from Mammal
        t.roar();    // from Tiger

        System.out.println("\n=== Reptile Object (Hierarchical Inheritance) ===");
        Reptile r = new Reptile();
        r.eat();     // from Animal
        r.crawl();   // from Reptile
    }
}
