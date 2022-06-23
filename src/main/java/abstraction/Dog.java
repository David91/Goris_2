package abstraction;

public class Dog extends Animal {

    public Dog(int l, int n) {
        super(l,n);
    }

    @Override
    public void moveForward() {
        System.out.println("Move by walking and running");
    }

    @Override
    public void speak() {
        System.out.println("Bark bark");
    }
}
