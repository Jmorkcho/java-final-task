public class Tablet extends Product {
    private String color;
    private float diagonal;

    public Tablet(String brand, String color, float diagonal,int price) {
        super (brand, price);
        this.color = color;
        this.diagonal = diagonal;
    }

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}
    public float getDiagonal() {return diagonal;}
    public void setDiagonal(float diagonal) {this.diagonal = diagonal;}


    @Override
    public String toString() {
        return "Tablet: " + getBrand() + ", " + color + ", " + diagonal + "cm," + getPrice() + " lv;";
    }

    @Override
    public int priority() {
        return 1;
    }
}
