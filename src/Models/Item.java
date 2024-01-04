package Models;
import java.util.Arrays;

public class Item {
    String name;

    int productcode;
    String description;
    String brand;
    double price;
    String[] size;

    public Item(String name,int productcode,String description,String brand ,  double price, String[] size) {
        this.name = name;
        this.productcode = productcode;
        this.description = description;
        this.brand = brand;
        this.price = price;
        this.size = size;

    }

    // Getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductcode() {
        return productcode;
    }

    public void setProductcode(int productcode) {
        this.productcode = productcode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String[] getSize() {
        return size;
    }

    public void setSize(String[] size) {
        this.size = size;
    }

    public void describe() {
        System.out.println(" name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Product code: " + productcode);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Sizes: " + Arrays.toString(size));
    }
}
