package abstraction;

public class Cat extends Animal{

    public Cat(int legsCount, int neckLength) {
        super(legsCount, neckLength);
    }

    @Override
    public void moveForward() {
        System.out.println("Moving by running/walking or climbing");
    }

    @Override
    public void speak() {
        System.out.println("Mew-mew");
    }
}
