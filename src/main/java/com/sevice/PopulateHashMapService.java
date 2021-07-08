package com.sevice;

import com.model.LinkedRandomPOJO;
import com.model.RandomPOJO;

import java.util.Date;
import java.util.HashMap;

import static com.google.common.collect.Maps.newHashMap;

public class PopulateHashMapService {

    private HashMap someMap;

    public PopulateHashMapService() {
        this.someMap = newHashMap();
    }

    public HashMap getObjectToBeAnalysed(int numberOfEntries) {
        for (int i = 0; i < numberOfEntries; i++) {
            LinkedRandomPOJO linkedRandomPOJO = new LinkedRandomPOJO(i * 2, "name" + i, Long.valueOf(i), new Date());
            RandomPOJO randomPOJO = new RandomPOJO(i * 8, "new" + i + "random name", linkedRandomPOJO);
            this.someMap.put(i, randomPOJO);
        }

        return this.someMap;
    }
}
