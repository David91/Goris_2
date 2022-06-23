package classes;

public class RectangleTableModifiable extends RectangleTable {

    private double len;
    private String addedPartColor;

    public RectangleTableModifiable(double length, double width, double len, String color) {
        super(length, width);
        this.len = len;
        this.addedPartColor = color;
    }

    public double getLen() {
        return len;
    }

    public String getAddedPartColor() {
        return addedPartColor;
    }

    @Override
    public double getWoodAmountByKG() {
        return super.getWoodAmountByKG() + getAddedWoodAmountByKG();
    }

    public double getAddedWoodAmountByKG() {
        return len * width * height;
    }

}
