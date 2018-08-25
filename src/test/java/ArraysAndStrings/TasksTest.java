package ArraysAndStrings;

import org.junit.Assert;
import org.junit.Test;


public class TasksTest {
    @Test
    public void differentString() throws Exception {
        boolean actual =  Tasks.isPermutation("qqqw","wwq");
        Assert.assertFalse(actual);
    }

    @Test
    public void similarString() throws Exception {
        boolean actual = Tasks.isPermutation("qwerty","ytrewq");
        Assert.assertTrue(actual);
    }

    @Test
    public void checkNull() throws Exception {
    boolean actual = Tasks.isPermutation(null,null);
        Assert.assertFalse(actual);
    }

    @Test
    public void checkEmptyStr() throws Exception {
        boolean actual = Tasks.isPermutation("","");
        Assert.assertFalse(actual);
    }

    @Test
    public void dellDuplicates() throws Exception {
        int[] array = new int[]{0,1,1,2,3,4,4,4,4};
        Tasks.removeDuplicates(array);
    }

    @Test
    public void dellDuplicatesWithoutExtraMemory() throws Exception {
        int[] array = new int[]{0,1,1,2,3,4,4,4};
        Tasks.removeDuplicatesWithOutExtraMemory(array);
    }

    @Test
    public void remDupRec() throws Exception {
        int[] array = new int[]{0,1,1,2,3,4,4,4};
        Tasks.removeDuplicatesWithOutExtraMemory(array);
    }

}