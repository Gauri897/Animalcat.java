class Animal {
    void move() {
        System.out.println("Animal moves");
    }
}

class Cheetah extends Animal {
  
    void move() {
        System.out.println("Cheetah runs fast");
    }
}

public class Main6{
    public static void main(String[] args) {
        Cheetah ch = new Cheetah();
        ch.move();
    }
}
