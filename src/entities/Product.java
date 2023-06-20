package entities;

public class Product {

    private String name;
    private Double amount;
    private String Category;
    private Integer quantity;


    public Product(String name, Double amount, String category, Integer quantity) {
        this.name = name;
        this.amount = amount;
        Category = category;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", Category='" + Category + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
