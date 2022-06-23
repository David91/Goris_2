package tests.abstraction;

import abstraction.Animal;
import abstraction.Cat;
import abstraction.Dog;
import org.testng.annotations.Test;

interface A {
    int a = 6;
}

public class AbstractionTest {

    @Test
    public void testAbstraction() {
        Animal[] animals = {new Dog(4, 3), new Cat(6, 8)};

        for (Animal animal : animals) {
            animal.speak();
        }

    }
}
