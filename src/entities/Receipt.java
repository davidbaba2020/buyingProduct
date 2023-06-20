package entities;

import java.time.LocalDate;

public class Receipt {
    private String productSold;
    private Double priceOfProductBought;
    private LocalDate dateBought;


    public Receipt(String productSold, Double priceOfProductBought, LocalDate dateBought) {
        this.productSold = productSold;
        this.priceOfProductBought = priceOfProductBought;
        this.dateBought = dateBought;
    }

    public String getProductSold() {
        return productSold;
    }

    public void setProductSold(String productSold) {
        this.productSold = productSold;
    }

    public Double getPriceOfProductBought() {
        return priceOfProductBought;
    }

    public void setPriceOfProductBought(Double priceOfProductBought) {
        this.priceOfProductBought = priceOfProductBought;
    }

    public LocalDate getDateBought() {
        return dateBought;
    }

    public void setDateBought(LocalDate dateBought) {
        this.dateBought = dateBought;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "productSold='" + productSold + '\'' +
                ", priceOfProductBought=" + priceOfProductBought +
                ", dateBought=" + dateBought +
                '}';
    }
}
