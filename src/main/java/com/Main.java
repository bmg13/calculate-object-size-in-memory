package com;

import com.model.LinkedRandomPOJO;
import com.model.RandomPOJO;
import com.sevice.PopulateHashMapService;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

/**
 * Application launcher
 */
public class Main {

    private static long entireObjectSize;
    private static long entireListSize;

    public static void main(String[] args) throws ParseException {
        printString("some string here.");
        insertSeparationLine();
        printRandomObject();
        insertSeparationLine();
        printList();
        insertSeparationLine();
        PopulateHashMapService populateHashMapService = new PopulateHashMapService();
        printMap(populateHashMapService);
        insertSeparationLine();
    }


    private static void printList() {
        List<LinkedRandomPOJO> linkedRandomPOJOS = newArrayList();
        for (int i = 0; i < 1000; i++) {
            LinkedRandomPOJO linkedRandomPOJO = new LinkedRandomPOJO(i + 8520, "el name", 10L, new Date());
            linkedRandomPOJOS.add(linkedRandomPOJO);
        }

        linkedRandomPOJOS.forEach(a -> entireListSize += CalculateObjectSizeInMemoryService.getObjectSize(a));

        printObjectSizeWithReferences(linkedRandomPOJOS);
        printEntireObjectSize(linkedRandomPOJOS, entireListSize);
    }

    private static void printRandomObject() {
        LinkedRandomPOJO linkedRandomPOJO = new LinkedRandomPOJO(8520, "el name", 10L, new Date());
        RandomPOJO randomPOJO = new RandomPOJO(8520, "new random s", linkedRandomPOJO);
        printObjectSizeWithReferences(randomPOJO);
    }

    private static void printString(String s) {
        printObjectSizeWithReferences(s);
    }

    private static void printMap(PopulateHashMapService populateHashMapService) {
        HashMap objectToBeAnalysed = populateHashMapService.getObjectToBeAnalysed(1000000);
        objectToBeAnalysed.forEach((a, b) -> sumEachObject(a, b));
        printObjectSizeWithReferences(objectToBeAnalysed);
        printEntireObjectSize(objectToBeAnalysed, entireObjectSize);
    }

    private static void printEntireObjectSize(Object objectToBeAnalysed, long objectSize) {
        System.out.println("Object type: " + objectToBeAnalysed.getClass() +
                ", size of entire content is " + objectSize + " bytes");
    }

    public static void printObjectSizeWithReferences(Object object) {
        System.out.println("Object type: " + object.getClass() +
                ", single size: " + CalculateObjectSizeInMemoryService.getObjectSize(object) + " bytes");
    }

    private static void insertSeparationLine() {
        System.out.println("------------------------------------------------------------------------------");
    }

    public static void sumEachObject(Object a, Object b) {
        entireObjectSize += CalculateObjectSizeInMemoryService.getObjectSize(a);
        entireObjectSize += CalculateObjectSizeInMemoryService.getObjectSize(b);
    }
}