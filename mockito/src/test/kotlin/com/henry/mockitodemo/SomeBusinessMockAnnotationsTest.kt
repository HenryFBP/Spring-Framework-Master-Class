package com.henry.mockitodemo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class SomeBusinessMockAnnotationsTest {

    @Mock
    lateinit var dataServiceMock: DataService

    @InjectMocks
    lateinit var someBusinessImpl: SomeBusinessImpl

    @Test
    fun testFindGreatest() {

        //this is how we mock easily
        //note: in kotlin "when" is a keyword, we use ` to notate it's a method name and not a keyword in this context
        `when`(dataServiceMock.retrieveAllData()).thenReturn(arrayOf(24, 6, 72, -10))

        val i = (someBusinessImpl.findTheGreatestFromAllData())

        assertEquals(i, 72)
    }

    @Test
    fun testFindGreatestForOneValue() {

        `when`(dataServiceMock.retrieveAllData()).thenReturn(arrayOf(3))

        val i = (someBusinessImpl.findTheGreatestFromAllData())

        assertEquals(i, 3)
    }

}

