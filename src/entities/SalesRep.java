package entities;

import ENUMS.ROLE;

import java.util.List;

public class SalesRep {
    private String name;
    private ROLE role;


    public SalesRep(String name, ROLE role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ROLE getRole() {
        return role;
    }

    public void setRole(ROLE role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "SalesRep{" +
                "name='" + name + '\'' +
                ", role=" + role +
                '}';
    }


    //Add product if finished, sell product, offer receipt)


    public String addProductToStore(Product product, Store store) {
        List<Product> storeProducts = store.getListOfProducts();
        storeProducts.add(product);
        return "Product added to store successfully";
    }

//    public Integer addTwoNumber (int a, int b) {
//        Integer sum = a+b;
//        return sum;
//    }


}
