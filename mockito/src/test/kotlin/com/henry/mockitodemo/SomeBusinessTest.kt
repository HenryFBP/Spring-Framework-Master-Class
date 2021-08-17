package com.henry.mockitodemo

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class SomeBusinessTest {

    @Test
    fun testFindGreatest() {
        var bi = SomeBusinessImpl(DataServiceStub());

        var i = (bi.findTheGreatestFromAllData())

        assertEquals(i, 72)
    }

}

class DataServiceStub : DataService {
    override fun retrieveAllData(): Array<Int> {
        return arrayOf(24, 6, 72, -10)
    }

}