package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelMethodsTest {
    int i = 0;
    ThreadLocal<Integer> someInt = new ThreadLocal<>();

    @BeforeMethod
    public void setup() {
        System.out.println("Thread id is -> " + Thread.currentThread().getId());
    }

    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("ParallelMethodsTest.test1" + Thread.currentThread().getId());
    }

    @Test
    public void test2() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("ParallelMethodsTest.test2" + Thread.currentThread().getId());
    }
}
