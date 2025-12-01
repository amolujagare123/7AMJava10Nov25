package InheritanceDemo;// MultilevelInheritanceDemo.java

// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Child class of Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

// Child class of Dog (Grandchild of Animal)
class BabyDog extends Dog {
    void weep() {
        System.out.println("BabyDog is weeping...");
    }
}

// Main class to run the program
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {

        // Object of Animal
        Animal a = new Animal();
        a.eat();

        System.out.println("--------------------");

        // Object of Dog
        Dog d = new Dog();
        d.bark();
        d.eat();

        System.out.println("--------------------");

        // Object of BabyDog
        BabyDog bd = new BabyDog();
        bd.weep();
        bd.bark();
        bd.eat();
    }
}
