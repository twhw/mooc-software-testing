package tudelft.numfinder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 26-11-18
 *
 * @author Tom
 */
public class NumFinderTest {


    @Test
    public void findLargest4(){
        int[] intArray = new int[] {4, 3, 2, 1};
        //int[] intArray = new int[] {4, 25, 7, 9};
        NumFinder nf = new NumFinder();
        nf.find(intArray);
        int largest = nf.getLargest();
        int smallest = nf.getSmallest();
        Assertions.assertEquals(4 , largest);
   }

    @Test
    public void findSmallest1(){
        int[] intArray = new int[] {4, 3, 2, 1};
        NumFinder nf = new NumFinder();
        nf.find(intArray);
        int largest = nf.getLargest();
        int smallest = nf.getSmallest();
        Assertions.assertEquals(1 , smallest);
    }


    @Test
    public void findLargest65656Smallest2(){
        int[] intArray = new int[] {3434, 65656, 2, 0};
        NumFinder nf = new NumFinder();
        nf.find(intArray);
        int largest = nf.getLargest();
        int smallest = nf.getSmallest();
        Assertions.assertEquals(65656 , largest);
        Assertions.assertEquals(0 , smallest);
    }

    @Test
    public void findLargest3SmallestMin4(){
        int[] intArray = new int[] {-4, 3, 2, -1};
        NumFinder nf = new NumFinder();
        nf.find(intArray);
        int largest = nf.getLargest();
        int smallest = nf.getSmallest();
        Assertions.assertEquals(3 , largest);
        Assertions.assertEquals(-4 , smallest);
    }

}
