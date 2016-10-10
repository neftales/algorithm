package sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortingTest {

    private SortJavaImpl sorting;

    @Before
    public void setUp() throws Exception {
        sorting = new SortJavaImpl();
    }

    @Test
    public void bubbleSortShouldSort() throws Exception {
        int[] array = {9, 5, 7, 8, 1, 3, 2, 4, 6};
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = sorting.bubbleSort(array);

        Assert.assertArrayEquals(sortedArray, result);
    }
}