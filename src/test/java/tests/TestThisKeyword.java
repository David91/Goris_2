package tests;

import classes.RectangleTable;
import org.testng.annotations.Test;

public class TestThisKeyword {

    @Test
    public void testThis() {
        RectangleTable firstTable = new RectangleTable(6.5, 4);
        RectangleTable secondTable = new RectangleTable(
                4.5, 3.2, 3, 1.4, "Red"
        );

        RectangleTable thirdTable = firstTable;
        System.out.println("Third table length " + thirdTable.length);
        System.out.println("First table length" + firstTable.length);

        thirdTable.color = "Green";
        System.out.println(thirdTable.color);
        System.out.println(firstTable.color);

        firstTable = secondTable;
        firstTable.length = 4.27;
        System.out.println(thirdTable.length);
        System.out.println(secondTable.length);
        System.out.println(firstTable.height);

        thirdTable = new RectangleTable(3,4);
        RectangleTable fourth = new RectangleTable(thirdTable);
        System.out.println(thirdTable.color);
    }

    @Test
    public void testRef() {
        RectangleTable table = new RectangleTable(4,5);
        RectangleTable table1 = table;
        table = new RectangleTable(7,8.9);
    }
}
