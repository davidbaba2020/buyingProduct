package entities;

import java.util.List;

public class Store {
    private String name;
    private static List<Product> listOfProducts;
    private static List<SalesRep> listOfStaff;

    public Store(String name, List<Product> listOfProducts, List<SalesRep> listOfStaff) {
        this.name = name;
        this.listOfProducts = listOfProducts;
        this.listOfStaff = listOfStaff;
    }

    public Store() {

    }


    public List<SalesRep> getListOfStaff() {
        return listOfStaff;
    }

    public void setListOfStaff(List<SalesRep> listOfStaff) {
        this.listOfStaff = listOfStaff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

//    public void setListOfProducts(List<Product> listOfProducts) {
//        this.listOfProducts = listOfProducts;
//    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", listOfProducts=" + listOfProducts +
                ", listOfStaff=" + listOfStaff +
                '}';
    }
}
