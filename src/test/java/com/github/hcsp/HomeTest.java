package com.github.hcsp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HomeTest {
    @Test
    public void referencePassingTest() {
        assertEquals(null, Home.cat);
        Home.newCat();
        assertEquals("Cat(Tom)", Home.cat.toString());
    }
}
