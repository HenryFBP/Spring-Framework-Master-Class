package com.henry.mockitodemo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class SomeBusinessMockTest {

    @Test
    fun testFindGreatest() {

        val dataServiceMock = mock(DataService::class.java)

        //this is how we mock easily
        //note: in kotlin "when" is a keyword, we use ` to notate it's a method name and not a keyword in this context
        `when`(dataServiceMock.retrieveAllData()).thenReturn(arrayOf(24, 6, 72, -10))

        val bi = SomeBusinessImpl(dataServiceMock);
        val i = (bi.findTheGreatestFromAllData())

        assertEquals(i, 72)
    }

    @Test
    fun testFindGreatestForOneValue() {

        val dataServiceMock = mock(DataService::class.java)

        //this is how we mock easily
        `when`(dataServiceMock.retrieveAllData()).thenReturn(arrayOf(3))

        val bi = SomeBusinessImpl(dataServiceMock);
        val i = (bi.findTheGreatestFromAllData())

        assertEquals(i, 3)
    }

}

