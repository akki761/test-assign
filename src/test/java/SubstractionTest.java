//Q1) Test Suite of Substraction class

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SubstractionTest {


    private Subtraction subtract =new Subtraction();


    @Test
    public void canaryTest() {
        Assert.assertTrue(true);
    }

    @Test
    public void testTheMainMethod() {
        String[] str = {"12", "13"};
        //Assert.assertTrue(subtract.main(str));
    }

    @Ignore  //test case ignored
    public void testTheSubtractWithTwoInts() {
        int a = 10;
        int b = 20;
        Assert.assertEquals("Subtracting two values", subtract.sub(10, 20), -10);
        // Assert.assertEquals(subtract.sub(10, 20), 31);
    }

    @Test
    public void testThesubWithTwoFloat() {

        Assert.assertEquals("Subtracting float", subtract.sub(10.2f, 8.5f), 1.7f, .005f);
    }

    @Test
    public void testTheWrapperInt() {
        Assert.assertEquals("Subtracting Integer", subtract.subInt(Integer.valueOf(10), Integer.valueOf(8)), Integer.valueOf(2));
    }

   @Test(expected = ArithmeticException.class)
   public void testThrowsRuntime(){

        subtract.throwsRuntime(4,0);
       System.out.println("In exception");

   }

}



