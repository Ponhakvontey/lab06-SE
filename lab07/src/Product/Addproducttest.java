package Product;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class Addproducttest {
    // Add product correctly (product name not exists)
    @Test
    @DisplayName("Add product correctly (product name not exists)")
    void testAddProduct() {
        ProductManager product = new ProductManager();
        product.addProduct("Apple", 1700.0, 50.0);
        assertEquals(1, product.getCount());

    }
    // Add product incorrectly (product name duplicated)
    
    @Test
    @DisplayName("Test Add Product Incorrectly (product name duplicated)")
    void testAddProductIncorrect() {
        ProductManager product = new ProductManager();
        product.addProduct("Apple", 1700.0, 50.0);
        product.addProduct("Apple", 1700.0, 50.0);
        assertEquals(1, product.getCount());
    }
    // Check for count is increased by 1 or not
    @Test
    @DisplayName("Test Count Increased by 1 or not")
    void testCountIncreased() {
        ProductManager product = new ProductManager();
        int initialCount = product.getCount();
        product.addProduct("Apple", 1700.0, 50.0);
        assertEquals(initialCount+1, product.getCount());
    }
}
