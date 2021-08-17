package com.henry.mockitodemo

import kotlin.math.max

class SomeBusinessImpl {
    private lateinit var dataservice: DataService;

    fun findTheGreatestFromAllData(): Int? {
        return dataservice.retrieveAllData().maxOrNull();
    }
}

interface DataService {
    fun retrieveAllData(): Array<Int>;
}