//Q1) Test suite of Addition class

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

 public class AdditionTest {


    private Addition addition = new Addition();



    @Test
    public void canaryTest() {
        Assert.assertTrue(true);
    }

    @Test
    public void testTheMainMethod() {
        String[] str = {"12", "13"};
        //Assert.assertTrue(Addition.main(str));
    }

    @Test
    public void testTheSumWithTwoInts() {
        int a = 10;
        int b = 20;
        Assert.assertEquals("Adding two values", addition.sum(10, 20), 30);
        // Assert.assertEquals(addition.sum(10, 20), 31);
    }

    @Test
    public void testTheSumWithTwoFloat() {

        Assert.assertEquals("Adding float", addition.sum(10.2f, 8.5f), 18.7f, .005f);
    }

    @Test
    public void testTheWrapperInt() {
        Assert.assertEquals("Adding Integer", addition.sumInt(Integer.valueOf(10), Integer.valueOf(8)), Integer.valueOf(18));
    }

    @Test
    public void testAddList(){
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        List<Integer> list1 = new ArrayList<>();
        list.add(30);
        list.add(50);
        List<Integer> ladd=new ArrayList<>();
        ladd.addAll(list);
        ladd.addAll(list1);
        Assert.assertEquals("This is list addition",addition.sum(list,list1),ladd);
    }
}



