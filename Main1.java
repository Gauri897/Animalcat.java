class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
     void makeSound() {
        System.out.println("Cat barks"); 
    }
}

public class Main1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
    }
}
