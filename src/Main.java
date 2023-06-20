import ENUMS.ROLE;
import entities.Customer;
import entities.Product;
import entities.SalesRep;
import entities.Store;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        List<Product> productsInStore = new ArrayList<>();
        List<SalesRep> staffMembers = new ArrayList<>();
        Store timStore = new Store("TimStore",productsInStore,staffMembers);
        SalesRep seller = new SalesRep("Deby", ROLE.SALES_PERSON);
        Customer dave = new Customer("David",200.00,ROLE.CUSTOMER);

        staffMembers.add(seller);
        timStore.setListOfStaff(staffMembers);

        Product milk = new Product("Milk",20.00,"Beverages",10);
        Product milo = new Product("Milo",12.00,"Beverages",7);

        seller.addProductToStore(milk,timStore);
        seller.addProductToStore(milo,timStore);


        System.out.println(timStore);

        System.out.println(dave.buyProduct(milk,timStore));
        System.out.println(dave.buyProduct(milk,timStore));
        System.out.println(dave.buyProduct(milk,timStore));
        System.out.println(timStore.getListOfProducts());
        System.out.println(dave.getTotalAAmountOfMoney());


    }
}