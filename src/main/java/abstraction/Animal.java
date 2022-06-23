package abstraction;

public abstract class Animal {

    private int legsCount;
    private double neckLength;

    public Animal(int legsCount, int neckLength) {
        this.legsCount = legsCount;
        this.neckLength = neckLength;
    }

    public abstract void moveForward();
    public abstract void speak();
}
