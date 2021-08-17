package com.henry.junit

import com.henry.junit.MyMath
import org.junit.Assert
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test
import org.junit.Assert.assertEquals

class MyMathTest {

    lateinit var mm: MyMath

    @Before
    fun before(){
        println("I run before all tests! Initializing mm object.")
        mm = MyMath()
    }

    @Test
    fun sum_with_3_nums() {
        assertEquals(mm.sum(1, 2, 3), 6)
    }

    @Test
    fun sum_test_1(){
        assertEquals(mm.sum(1),1)
    }
}