package testlab06;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import lab6.Simplemathclass;

public class SimpleMathTest {
    @Test
    @DisplayName("Test add function")
    void testAddPositive(){
        assertEquals(4, Simplemathclass.add(2, 2));
    }
    @Test
    @DisplayName("Test add function with negative numbers")
    void testAddNegative(){
        assertEquals(0, Simplemathclass.add(-2, 2));
    }
    @Test
    @DisplayName("Test subtract function")
    void testSubtractPositive(){
        assertEquals(0, Simplemathclass.subtract(2, 2));
    }
    @Test
    @DisplayName("Test subtract function with negative numbers")
    void testSubtractNegative(){
        assertEquals(-4, Simplemathclass.subtract(-2, 2));
    }
    @Test
    @DisplayName("Test multiply function")
    void testMultiplyPositive(){
        assertEquals(4, Simplemathclass.multiply(2, 2));
    }
    @Test
    @DisplayName("Test multiply function with negative numbers")
    void testMultiplyNegative(){
        assertEquals(-4, Simplemathclass.multiply(-2, 2));
    }
    @Test
    @DisplayName("Test divide function with positive numbers")
    void testDividePositive(){
        assertEquals(1, Simplemathclass.division(2, 2));
    }
    @Test
    @DisplayName("Test divide function with negative numbers")
    void testDivideNegative(){
        assertEquals(-1, Simplemathclass.division(-2, 2));
    }
    @Test
    @DisplayName("Test divide function with Zero by zero")
    void testDivideZeroByZero(){
        Exception exc=assertThrows(IllegalArgumentException.class, ()->Simplemathclass.division(0, 0));
        assertEquals("Infinity", exc.getMessage());
    }
    @Test
    @DisplayName ("Test divide function with None by zero")
    void testDivideNonZeroByZero(){
        Exception exc=assertThrows(IllegalArgumentException.class, ()->Simplemathclass.division(2, 0));
        assertEquals("Cannot divide by zero", exc.getMessage());
    }




    
}
