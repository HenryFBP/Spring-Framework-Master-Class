package com.henry.mockitodemo

import kotlin.math.max

class SomeBusinessImpl(dataService: DataService) {

    //essentially the constructor
    private var dataservice: DataService = dataService;

    fun findTheGreatestFromAllData(): Int? {
        return dataservice.retrieveAllData().maxOrNull();
    }
}

interface DataService {
    fun retrieveAllData(): Array<Int>;
}