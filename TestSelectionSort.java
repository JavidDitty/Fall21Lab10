/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class TestSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public TestSelectionSort() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        SelectionSort sort = new SelectionSort();
        int[] resultArr = sort.basicSelectionSort(arr);
        Assert.assertNotNull("Failure: Actual value is null but expected value is not null", resultArr);
        Assert.assertArrayEquals("Failure: Actual value not equal to expected value", Sortedarr, resultArr);
    }

    public void testNegative(){
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;

        SelectionSort sort = new SelectionSort();
        int[] resultArr = sort.basicSelectionSort(arr);
        Assert.assertNotNull("Failure: Actual value is null but expected value is not null", resultArr);
        Assert.assertArrayEquals("Failure: Actual value not equal to expected value", Sortedarr, resultArr);
    }

    public void testMixed(){
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = 9;
        arr[2] = 0;
        arr[3] = -10;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -8;
        Sortedarr[2] = -2;
        Sortedarr[3] = 0;
        Sortedarr[4] = 9;

        SelectionSort sort = new SelectionSort();
        int[] resultArr = sort.basicSelectionSort(arr);
        Assert.assertNotNull("Failure: Actual value is null but expected value is not null", resultArr);
        Assert.assertArrayEquals("Failure: Actual value not equal to expected value", Sortedarr, resultArr);
    }

    public void testDuplicates(){
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = 9;
        arr[2] = 9;
        arr[3] = -8;
        arr[4] = -2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -8;
        Sortedarr[1] = -8;
        Sortedarr[2] = -2;
        Sortedarr[3] = 9;
        Sortedarr[4] = 9;

        SelectionSort sort = new SelectionSort();
        int[] resultArr = sort.basicSelectionSort(arr);
        Assert.assertNotNull("Failure: Actual value is null but expected value is not null", resultArr);
        Assert.assertArrayEquals("Failure: Actual value not equal to expected value", Sortedarr, resultArr);
    }


}
