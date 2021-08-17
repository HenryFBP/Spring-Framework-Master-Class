package com.henry.mockitodemo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*

class ListTest {

    @Test
    fun test(){
        val listMock = mock(List::class.java);

        //return 10 first, then 20...
        `when`(listMock.size)
            .thenReturn(10)
            .thenReturn(20);

        assertEquals(10, listMock.size)
        assertEquals(20, listMock.size)
    }

    @Test
    fun testGet(){
        val listMock = mock(List::class.java);

        `when`(listMock.get(1)).thenReturn("xyz")

        assertEquals(listMock.get(1), "xyz");
    }
    @Test
    fun testGetAny(){
        val listMock = mock(List::class.java);

        `when`(listMock.get(anyInt())).thenReturn(":3")

        assertEquals(listMock.get(1), ":3");
        assertEquals(listMock.get(2), ":3");
    }
}