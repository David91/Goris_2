package tests;

import classes.RectangleTable;
import classes.RectangleTableModifiable;
import org.testng.annotations.Test;

public class TestRectangleTables {

    @Test
    public void testRectangleTable() {
        RectangleTableModifiable rectangleTableModifiable =
                new RectangleTableModifiable(12, 15, 4, "red");
        RectangleTable rectangleTable = new RectangleTable(30, 60);

        RectangleTableModifiable refToModifiable =
                new RectangleTableModifiable(30, 60, 4, "green");
        RectangleTable ref = new RectangleTable(12,23);

        System.out.println(rectangleTableModifiable.getWoodAmountByKG());
        RectangleTable[] rectangleTables =
                { rectangleTable, refToModifiable, new RectangleTable(23, 44),
                  new RectangleTableModifiable(2,3,1,"Cigrovka")};

        for (RectangleTable r: rectangleTables) {
            System.out.println(r.getWoodAmountByKG());
        }

        someMethod(4);

    }

    public float someMethod(float a) {
        System.out.println("In float");
        return 4.1f;
    }

    public void someMethod(double d) {
        System.out.println("In double");
    }
}
