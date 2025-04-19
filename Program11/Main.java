package Program11;
interface Flyer {
    void fly();
}

abstract class Bird {
    abstract void makeSound();
}

class Eagle extends Bird implements Flyer {
    public void fly() {
        System.out.println("Eagle flies high");
    }

    void makeSound() {
        System.out.println("Eagle screeches");
    }
}

public class Main {
    public static void main(String[] args) {
        Eagle e = new Eagle();
        e.fly();
        e.makeSound();
    }
}
