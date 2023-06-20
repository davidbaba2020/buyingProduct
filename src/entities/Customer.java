package entities;

import ENUMS.ROLE;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.List;

public class Customer {
    private String name;
    private Double totalAAmountOfMoney;
    private ROLE role;



    public Customer(String name, Double totalAAmountOfMoney, ROLE role) {
        this.name = name;
        this.totalAAmountOfMoney = totalAAmountOfMoney;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public ROLE getRole() {
        return role;
    }

    public void setRole(ROLE role) {
        this.role = role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getTotalAAmountOfMoney() {
        return totalAAmountOfMoney;
    }

    public void setTotalAAmountOfMoney(Double totalAAmountOfMoney) {
        this.totalAAmountOfMoney = totalAAmountOfMoney;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", totalAAmountOfMoney=" + totalAAmountOfMoney +
                ", role=" + role +
                '}';
    }


    //Buy product (Check if product is available,
    // check if you have enough money to buy,
    // buy product)

    public Object buyProduct(Product product, Store store) {
        List<Product> storeProducts = store.getListOfProducts();
        if(storeProducts.contains(product)) {
            Double amountForCustomer = this.totalAAmountOfMoney;
            if(amountForCustomer>=product.getAmount()) {

                storeProducts.remove(product);
                product.setQuantity(product.getQuantity()-1);
                storeProducts.add(product);

                Double customerBalance = this.totalAAmountOfMoney-product.getAmount();
                this.setTotalAAmountOfMoney(customerBalance);
//                Receipt receipt =new Receipt(product.getName(), product.getAmount(), LocalDate.now());
                return new Receipt(product.getName(), product.getAmount(), LocalDate.now());
            } else {
                return "You have insufficient fund";
            }
        } else {
            return "Product not available";
        }
    }

}
