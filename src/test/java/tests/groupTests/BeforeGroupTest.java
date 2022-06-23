package tests.groupTests;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeGroupTest {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeGroupTest.beforeMethod");
    }

    @BeforeGroups(groups = "gr1")
    public void beforeGroups() {
        System.out.println("Before group setup");
    }

    @Test(groups = "gr1")
    public void test1() {
        System.out.println("test1 is in group gr1");
    }

    @Test(groups = "gr1")
    public void test1_1() {
        System.out.println("test1_1 is in group gr1");
    }

    @Test(groups = "gr2")
    public void test2() {
        System.out.println("test2 is in group gr2");
    }

    public void test3() {
        System.out.println("test3");
    }
}
