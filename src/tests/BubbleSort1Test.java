package tests;

import app.BubbleSort;
import app.BubbleSort1;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class BubbleSort1Test {
    int arr2[] = {-4,-3,-2,1,4,5,6};
    int arr1[] = {1,-3,4,-4,-2,5,6};
    int arr[] = {};


    BubbleSort bubble;

    @Before
    public void setUp() throws Exception {
    bubble = new BubbleSort1();
    }

    @Test
    public void bubbleSort1() throws Exception {
//        for (int i = 0; i<arr1.length; i++){
//
//            assertEquals(arr1[i], arr1[i]);
//        }
      Assert.assertArrayEquals(bubble.BubbleSort1(arr1), arr2);
//      Assert.assertEquals(
//              Array.toString(bubble.BubbleSort1(arr1)),
//              Array.toString(arr2));


    }

}