package com.github.hcsp;

import com.github.hcsp.pet.Cat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeTest {
    @Test
    public void referencePassingTest() {
        Assertions.assertEquals(null, Home.cat);
        Home.newCat();
        Assertions.assertEquals("Cat(Tom)", Home.cat.toString());
    }
}
