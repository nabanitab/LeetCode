package designPattern;

public class ProductDesignBuilderClass {
    private Integer id;
    private String name;
    private Double money;

    public ProductDesignBuilderClass(Integer id, String name, Double money) {

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

    public static class Builder {
        private Integer id;
        private String name;
        private Double money;

        public Builder setId(Integer id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setMoney(Double money) {
            this.money = money;
            return this;
        }

        public ProductDesignBuilderClass build() {
            return new ProductDesignBuilderClass(id, name, money);
        }
    }
}
