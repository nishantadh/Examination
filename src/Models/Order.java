package Models;
import java.util.Arrays;

public class Order {
    String name;
    int phone_number;
    int[] items;
    int[] price;

    public Order(String name,int phone_number,int[] items,int[] price) {
        this.name = name;
        this.phone_number = phone_number;
        this.items = items;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public int[] getItems() {
        return items;
    }

    public void setItems(int[] items) {
        this.items = items;
    }

    public int[] getPrice() {
        return price;
    }

    public void setPrice(int[] price) {
        this.price = price;
    }

    public void displayInformation() {
        double total = 0;
        for (double price : price) {
            total += price;
        }
        // considering 13% vat in nepal context
        double vat = total * 0.13;
        double totalPrice = total + vat;

        System.out.println("Order details:");
        System.out.println("Name: " + name);
        System.out.println("Phone number: " + phone_number);
        System.out.println("Items: " + Arrays.toString(items));
        System.out.println("Prices: " + Arrays.toString(price));
        System.out.println("Total price (including VAT 13%): " + totalPrice);
    }
}

