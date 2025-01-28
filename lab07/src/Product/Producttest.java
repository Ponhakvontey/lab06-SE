package Product;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class Producttest {
    // Set name correctly (name is not blank)
    @Test
    @DisplayName("Test Set Name Correctly ")
    void testSetName() {
        Product product = new Product();
        product.setName("Grape");
        assertEquals("Grape", product.getName());
    }

    // Set name incorrectly (name is blank)
    @Test
    @DisplayName("Test Set Name Incorrectly")
    void testSetNameIncorrect() {
        Product product = new Product();
        product.setName("   ");
        assertNull(product.getName());
    }

    // Set price correctly (price is greater than 0)
    @Test
    @DisplayName("Test Set Price Correctly")
    void testSetPrice() {
        Product product = new Product();
        product.setPrice(10);
        assertEquals(10.0, product.getPrice());
    }
    // Set price incorrectly (price is less than or equals to 0)
    @Test
    @DisplayName("Test Set Price Incorrectly")
    void testSetPriceIncorrect() {
        Product product = new Product();
        product.setPrice(-10);
        assertEquals(0.0, product.getPrice());
    }
    // Set discount correctly (discount is between 0 and 100)
    @Test
    @DisplayName("Test Set Discount Correctly")
    void testSetDiscount() {
        Product product = new Product();
        product.setDiscount(10);
        assertEquals(10.0, product.getDiscount());
    }
    // Set discount incorrectly (discount less than 0 or greater than 100)
    @Test
    @DisplayName("Test Set Discount Incorrectly")
    void testSetDiscountIncorrect() {
        Product product = new Product();
        product.setDiscount(-10);
        assertEquals(0.0, product.getDiscount());
    }


    
}
