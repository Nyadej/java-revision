/*
The exercise template has a class Product, which represents a product in a shop. Every product has a name, location and weight.

Add the following three constructors to the Product class:

public Product(String name) creates a product with the given name. Its location is set to "shelf" and its weight is set to 1.
public Product(String name, String location) creates a product with the given name and the given location. Its weight is set to 1.
public Product(String name, int weight) creates a product with the given name and the given weight. Its location is set to "shelf".
 */

public class Product {
    private String name; 
    private String location; 
    private int weight; 

    public Product(String name, String location, int weight) {
        this.name = name;
        this.location = location; 
        this.weight = weight; 
    }

    public Product (String name) {
        this(name, "shelf", 1);
    }

    public Product(String name, String location) {
        this(name, location, 1);
    }

    public Product(String name, int weight) {
        this(name, "shelf", weight);
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Product[name=" + name + ", location=" + location + ", weight=" + weight + "]";
    }

    public static void main(String[] args) {
        Product product1 = new Product("Product1");
        Product product2 = new Product("Product2", "warehouse");
        Product product3 = new Product("Product3", 5);
        Product product4 = new Product("Product4", "store", 3);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);
    }
}
