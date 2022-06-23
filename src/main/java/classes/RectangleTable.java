package classes;

public class RectangleTable {

    private static int TABLES_COUNT;
    protected double length;
    protected double width;
    protected int tableLegsCount = 4;
    protected double height = 1.2;
    protected String color = "brown";
    public static final double WOOD_DENSITY = 3.4;

    public RectangleTable(double length, double width) {
        this.length = length;
        this.width = width;
        TABLES_COUNT++;
    }

    public RectangleTable(double length, double width, int tableLegsCount,
                          double height, String color) {
        setLength(length);
        this.width = width;
        this.height = height;
        this.tableLegsCount = tableLegsCount;
        this.color = color;
        TABLES_COUNT++;
    }

    public RectangleTable(RectangleTable table) {
        length = table.length;
        width = table.width;
        TABLES_COUNT++;
        // ........
    }

    public double getWoodAmountByKG() {
        return length * width * height * WOOD_DENSITY;
    }

    public void setLength(double l) {
        if (l > 0 && l < 10000) {
            length = l;
        } else {
            System.exit(1);
        }
    }

    public int getTableLegsCount() {
        return tableLegsCount;
    }

}
