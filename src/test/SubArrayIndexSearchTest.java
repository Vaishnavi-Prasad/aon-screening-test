package test;

import com.aonscreening.test.task2.SubArrayIndexSearch;
import org.junit.Assert;
import org.junit.Test;

public class SubArrayIndexSearchTest {
/* In the test cases i have tested for  3 scenarios , found,not found and if duplicates are present*/
    @Test
    public void testFindSubArrayIndex_found() {
        int[] array = {4, 9, 3, 7, 8}; int[] subArray = {3, 7};
        int index = SubArrayIndexSearch.findSubArrayIndex(array, subArray); Assert.assertEquals(2, index);
    }

    @Test public void testFindSubArrayIndex_notFound() {
        int[] array = {4, 9, 3, 7, 8}; int[] subArray = {7, 3};
        int index = SubArrayIndexSearch.findSubArrayIndex(array, subArray); Assert.assertEquals(-1, index);
    }

    @Test
    public void testIndexWithArraysMethod_found() {
        int[] array = {4, 9, 3, 7, 8}; int[] subArray = {3, 7};
        int index = SubArrayIndexSearch.findSubArrayIndex(array, subArray); Assert.assertEquals(2, index);
    }

    @Test public void testFindSubArrayIndex_duplicates() {
        int[] array = {4, 3, 9, 3, 7, 8}; int[] subArray = {3, 7};
        int index = SubArrayIndexSearch.findSubArrayIndex(array, subArray);
        Assert.assertEquals(3, index);
    }
}
