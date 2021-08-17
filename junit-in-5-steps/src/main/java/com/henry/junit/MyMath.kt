package com.henry.junit

import java.util.Arrays

class MyMath {
    fun sum(vararg args: Int): Int {
        return Arrays.stream(args).sum()
    }
}