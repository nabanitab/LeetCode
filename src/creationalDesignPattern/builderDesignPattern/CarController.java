package creationalDesignPattern.builderDesignPattern;

import java.time.LocalDateTime;

public class CarController {
    public static void main(String[] args) {
        CarBuiderClass designPattern = new CarBuiderClass.Builder()
                .setId(1)
                .setName("nabanita")
                .setPrice(123.09)
                .setDeliveryDate(LocalDateTime.of(2024, 4, 8, 12, 30))
                .build();

        System.out.println(designPattern.getId());
        System.out.println(designPattern.getName());
        System.out.println(designPattern.getDeliveryDate());
        System.out.println(designPattern.getPrice());
    }
}

