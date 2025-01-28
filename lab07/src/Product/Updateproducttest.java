package Product;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Updateproducttest {
    //  Update product correctly (product name exists, new name is not blank)
    @Test
    @DisplayName("Update product correctly (product name exists, new name is not blank)")
    void testUpdateProduct() {
        ProductManager product= new ProductManager();
        product.addProduct("Apple", 1700.0, 50.0);
        boolean result = product.updateProduct("Apple", "Samsung", 700.0, 30.0);
        assertTrue(result);
        assertEquals(1, product.getCount());
    }
    //  Update product incorrectly (product name not exists)
    @Test
    @DisplayName("Test Update Product Incorrectly (product name not exists)")
    void testUpdateProductIncorrect() {
        ProductManager product = new ProductManager();
        product.addProduct("Apple", 1700.0, 50.0);
        boolean result = product.updateProduct("Oppo", "Vivo", 400.0, 20.0);
        assertFalse(result);
        assertEquals(1, product.getCount());
    }
    //  Update product incorrectly (product name exists but new name is blank)
    @Test
    @DisplayName("Test Update Product Incorrectly (product name exists but new name is blank)")
    void testUpdateProductIncorrectBlank() {
        ProductManager product = new ProductManager();
        product.addProduct("Apple", 1700.0, 50.0);
        boolean result = product.updateProduct("Apple", "", 700.0, 30.0);
        assertTrue(result);
        assertEquals(1, product.getCount());
    }
    //  Update product incorrectly (product name exists but new price is less than 0)
    @Test
    @DisplayName("Test Update Product Incorrectly (product name exists but new price is less than 0)")
    void testUpdateProductIncorrectPrice() {
        ProductManager product = new ProductManager();
        product.addProduct("Apple", 1700.0, 50.0);
        boolean result = product.updateProduct("Apple", "Samsung", -700.0, 30.0);
        assertTrue(result);
        assertEquals(1, product.getCount());
    }

    //  Update product incorrectly (product name exists but new discount is less than 0 or greater than 100)
    @Test
    @DisplayName("Test Update Product Incorrectly (product name exists but new discount is less than 0 or greater than 100)")
    void testUpdateProductIncorrectDiscount() {
        ProductManager product = new ProductManager();
        product.addProduct("Apple", 1700.0, 50.0);
        boolean result = product.updateProduct("Apple", "Samsung", 700.0, 110.0);
        assertTrue(result);
        assertEquals(1, product.getCount());
    }
    
}
