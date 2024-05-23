package creationalDesignPattern;

public class ProductClassUsingDesign {
    private Integer id;
    private String name;
    private Double money;

    public ProductClassUsingDesign(Integer id, String name, Double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getMoney() {
        return money;
    }
}
