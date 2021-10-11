package com.wiqer.lua;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongTest {
    @Test
    public void test(){
        Long l12=new Long(12);
        Long l12_=new Long(12);
        assertEquals(true, 12==new Long(12));
        assertEquals(true, l12==(long)l12_);
    }
}
