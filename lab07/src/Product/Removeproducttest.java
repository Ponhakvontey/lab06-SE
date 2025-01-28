package Product;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Removeproducttest {
    // Remove product correctly (product name exists)
    @Test
    @DisplayName("Test Remove Product Correctly")
    void testRemoveProduct() {
        ProductManager product = new ProductManager();
        product.addProduct("Apple", 1700.0, 50.0);
        product.removeProduct("Apple");
        assertEquals(0, product.getCount());
    }
    
    // Remove product incorrectly (product name not exists)
    @Test
    @DisplayName("Test Remove Product Incorrectly")
    void testRemoveProductIncorrect() {
        ProductManager product = new ProductManager();
        product.addProduct("Apple", 1700.0, 50.0);
        product.removeProduct("Samsung");
        assertEquals(1, product.getCount());
    }


    // Check for count is decreased by 1 or not
    @Test
    @DisplayName("Test Count Decreased")
    void testCountDecreased() {
        ProductManager product = new ProductManager();
        product.addProduct("Apple", 1700.0, 50.0);
        product.addProduct("Samsung", 700.0, 30.0);
        int initialCount = product.getCount();
        product.removeProduct("Apple");
        assertEquals(initialCount-1, product.getCount());
    }

    
}
