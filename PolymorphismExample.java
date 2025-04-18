class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Cat extends Animal {
    void speak() {
        System.out.println("Cat meows");
    }

    public static void main(String[] args) {
        Animal a = new Cat();  // polymorphism
        ((Cat) a).speak();
    }
}