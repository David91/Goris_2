package classes;

public class RectangleTable {

    public double length;
    public double width;
    public int tableLegsCount = 4;
    public double height = 1.2;
    public String color = "brown";

    public RectangleTable(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public RectangleTable(double length, double width, int tableLegsCount,
                          double height, String color) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.tableLegsCount = tableLegsCount;
        this.color = color;
    }

    public RectangleTable(RectangleTable table) {
        length = table.length;
        width = table.width;
        // ........
    }

}
