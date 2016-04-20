package heba.hebakalk;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;
 
public class calculatorTest {
 
 hebakalk Calculator = new hebakalk();

  
   
 // Test case addition
   @Test
   public void Addition1() {
    assertEquals("Unexepected error during addition!", 10.0, Calculator.add(5.0,5.0),0.0d);
   }
   
   @Test
   public void Addition2() {
    assertEquals("Unexepected error during addition!", 2.0, Calculator.add(-3.0,5.0),0.0d);
   }
   
  
   @Test
   public void Addition3() {
    assertEquals("Unexepected error during addition!", -10.0, Calculator.add(-5.0,-5.0),0.0d);
   }
   
 // Test case subtraction
   @Test
   public void subtraction1() {
    assertEquals("Unexepected error during subtraction!", 2.0, Calculator.sub(10.0,8.0),0.0d);
   }
   
   @Test
   public void subtraction2() {
    assertEquals("Unexepected error during subtraction!", -2.0, Calculator.sub(-3.0,-1.0),0.0d);
   }
   
   @Test
   public void subtraction3() {
    assertEquals("Unexepected error during subtraction!", -8.0, Calculator.sub(-3.0,5.0),0.0d);
   }
    
   
 // Test case multiplication
   
   @Test
   public void multiplication1() {
    assertEquals("Unexepected error during multiplication!", 2.0, Calculator.mul(1.0,2.0),0.0d);
   }
   
   @Test
   public void multiplication2() {
    assertEquals("Unexepected error during multiplication!", 5.0, Calculator.mul(-1.0,-5.0),0.0d);
   }
   
   @Test
   public void multiplication3() {
    assertEquals("Unexepected error during multiplication!", -25.0, Calculator.mul(-5.0,5.0),0.0d);
   }
   
 // Test case division  
   @Test
   public void division1() {
    assertEquals("Unexepected error during division!", 10.0, Calculator.div(20.0,2.0),0.0d);
   }
   @Test
   public void division2() {
    assertEquals("Unexepected error during division!", 10.0, Calculator.div(-20.0,-2.0),0.0d);
   }
   @Test(expected=java.lang.ArithmeticException.class)
   public void division3() {
    assertEquals("Unexepected error during division!", -1.0, Calculator.div(-5.0,5.0),0.0d);
   }
}
   
  