package creationalDesignPattern.builderDesignPattern;

import java.time.LocalDateTime;

public class SimpleCarClass {

    private int id;

    private String name;

    private LocalDateTime deliveryDate;

    private double price;

    public SimpleCarClass(int id, String name, LocalDateTime deliveryDate, double price) {
        this.id = id;
        this.name = name;
        this.deliveryDate = deliveryDate;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public double getPrice() {
        return price;
    }
}

