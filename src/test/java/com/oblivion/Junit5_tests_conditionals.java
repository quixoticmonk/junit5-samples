package com.oblivion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class Junit5_tests_conditionals {

    @Test
    @EnabledOnOs(OS.LINUX)
    void testLinuxDisable(){
        assertTrue(true);
    }

    @Test
    void testAssume(){
        assumeTrue(false);
        assertTrue(true);
    }

    @Test
    void testAssertAll(){
        assertAll(
                ()->assertTrue(true),
                ()->assertTrue(true),
                ()->assertTrue(true)
        );
    }



}
