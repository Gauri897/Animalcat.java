class Parent {
    int age = 50;
}

class Child extends Parent {
    int age = 25;

    void display() {
        System.out.println("Parent Age: " + super.age);
        System.out.println("Child Age: " + age);
    }

    public static void main(String[] args) {
        new Child().display();
    }
}