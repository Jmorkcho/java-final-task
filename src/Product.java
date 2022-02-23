public abstract class Product implements Comparable<Product> {
    private String brand;
    private int price;

    public Product(String brand, int price){
    this.brand = brand;
    this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {this.price = price;}

    @Override
    public int compareTo(Product product) {
        if(this.price > product.price)
            return 1;
        if(this.price < product.price)
            return -1;
        return Integer.compare(this.priority(), product.priority());
    }

    public abstract int priority();


}


//1-print all
//2-sort by price
//3-choose tablet/phone - get statistics
//4-enter number of products to parse - output(from one kind/not from one kind)
//0-exit