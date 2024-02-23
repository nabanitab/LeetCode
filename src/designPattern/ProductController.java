package designPattern;

public class ProductController {
    public static void main(String[] args) {
        // Creating a product using the builder pattern
        ProductDesignBuilderClass productBuilder = new ProductDesignBuilderClass.Builder()
                .setId(1)
                .setName("Product 1")
                .setMoney(10.5)
                .build();

        // Creating a product directly
        ProductClassUsingDesign productDirect = new ProductClassUsingDesign(2, "Product 2", 20.0);

        // Displaying product details
        System.out.println("Product created using builder pattern:");
        displayProductDetails(productDirect);

        System.out.println("\nProduct created directly:");
        displayProductDetails(productDirect);
    }

    private static void displayProductDetails(ProductClassUsingDesign product) {
        System.out.println("ID: " + product.getId());
        System.out.println("Name: " + product.getName());
        System.out.println("Price: " + product.getMoney());
    }
}

