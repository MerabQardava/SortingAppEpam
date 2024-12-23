package com.epamsorting;


import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SortingTest {

    private String input;
    private List<Integer> expected;

    public SortingTest(String input, List<Integer> expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {"\n",Arrays.asList()},
            {"5\n4\n3\n2\n1\n\n", Arrays.asList(1, 2, 3, 4, 5)},
            {"5\n4\n3\nfsd2\n1\n\n", Arrays.asList(1, 3, 4, 5)},
            {"1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n", Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)},
            {"1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n", Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)},
            {"1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n", Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)}
        });
    }

    @Test
    public void testGetSorted() {
        ByteArrayInputStream in = new ByteArrayInputStream(input.toString().getBytes());
        System.setIn(in);

        Sorting sorting = new Sorting();
        sorting.add();

        assertEquals(expected, sorting.getSorted());
    }


}
