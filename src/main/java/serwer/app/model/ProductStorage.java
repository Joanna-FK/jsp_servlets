package serwer.app.model;

import java.util.ArrayList;
import java.util.List;

public class ProductStorage {

    public static List<ProductDetails> productList = new ArrayList<>();

    static {
        ProductDetails product1 = new ProductDetails("water",1.5,  3);
        ProductDetails product2 = new ProductDetails("butter", 3.5, 4);
        ProductDetails product3 = new ProductDetails("bread", 2.5, 5);
        ProductDetails product4 = new ProductDetails("flour", 1.8, 6);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
    }

}
