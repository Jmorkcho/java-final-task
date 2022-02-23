public class Phone extends Product {
    private int cameras;
    private int year;
    public Phone(String brand, int cameras, int year, int price) {
        super(brand, price);
        this.cameras = cameras;
        this.year = year;
    }

    public int getCameras() {return cameras;}
    public void setCameras(int cameras) {this.cameras = cameras;}
    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;}


    @Override
    public String toString() {
        return "Tablet: " + getBrand() + ", " + cameras + ", " + year + "," + getPrice() + " lv;";
    }

    @Override
    public int priority() {
        return 0;
    }
}
