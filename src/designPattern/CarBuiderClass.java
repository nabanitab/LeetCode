package designPattern;

import java.time.LocalDateTime;

public class CarBuiderClass {

    private int id;

    private String name;

    private LocalDateTime deliveryDate;

    private double price;

    public CarBuiderClass(int id, String name, LocalDateTime deliveryDate, double price) {
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

    public static class Builder {
        private int id;

        private String name;

        private LocalDateTime deliveryDate;

        private double price;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDeliveryDate(LocalDateTime deliveryDate) {
            this.deliveryDate = deliveryDate;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        // Static method to create a new instance of CarBuilderClass
        public CarBuiderClass build() {
            return new CarBuiderClass(id, name, deliveryDate, price);
        }
    }
}


