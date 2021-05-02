package com.github.hcsp;

import com.github.hcsp.pet.Cat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.github.hcsp.Home.cat;

public class HomeTest {
    @Test
    public void referencePassingTest() {
        Assertions.assertEquals(null, cat);
        Home.newCat(cat);
        Assertions.assertEquals("Cat(Tom)", cat.toString());
    }
}
