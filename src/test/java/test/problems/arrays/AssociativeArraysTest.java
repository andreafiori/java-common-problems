package test.problems.arrays;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class AssociativeArraysTest
{
    @Test
    public void testListOfMap()
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "demo");
        map.put("fname", "fdemo");

        List<Map<String, String>> data = new ArrayList<>();
        data.add(0, map);

        assertEquals(data.get(0).get("name"), "demo");
        assertEquals(data.get(0).get("fname"), "fdemo");
    }
}
