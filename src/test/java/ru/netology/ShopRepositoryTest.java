package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShopRepositoryTest {
    @Test
    public void removeProductById() {
        ShopRepository shop = new ShopRepository();
        Product product_1 = new Product(10, "огурцы", 200);
        Product product_2 = new Product(30, "томаты", 400);
        Product product_3 = new Product(50, "капуста", 600);
        shop.add(product_1);
        shop.add(product_2);
        shop.add(product_3);
        shop.remove(10);
        Product[] expected = {product_2, product_3};
        Product[] actual = shop.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeProductByNotId() {
        ShopRepository shop = new ShopRepository();
        Product product_1 = new Product(10, "огурцы", 200);
        Product product_2 = new Product(30, "томаты", 400);
        Product product_3 = new Product(50, "капуста", 600);
        shop.add(product_1);
        shop.add(product_2);
        shop.add(product_3);
        Assertions.assertThrows(NotFoundException.class,
                () -> shop.remove(70)
        );
    }

//    @Test
//    public void notAddProductById() {
//        ShopRepository shop = new ShopRepository();
//        Product product_1 = new Product(10, "огурцы", 200);
//        Product product_2 = new Product(30, "томаты", 400);
//        Product product_3 = new Product(50, "капуста", 600);
//        shop.add(product_1);
//        shop.add(product_2);
//        shop.add(product_3);
//        Assertions.assertThrows(AlreadyExistsException.class,
//               () -> shop.addNewId(10)
//        );
//    }

//    @Test
//  public void addProductById() {
//        ShopRepository shop = new ShopRepository();
//        Product product_1 = new Product(10, "огурцы", 200);
//        Product product_2 = new Product(30, "томаты", 400);
//        Product product_3 = new Product(50, "капуста", 600);
//        shop.add(product_1);
//        shop.add(product_2);
//        shop.add(product_3);

//        Product[] expected = ;
//        Product[] actual = ;
//        Assertions.assertArrayEquals(expected,actual);
//}


}