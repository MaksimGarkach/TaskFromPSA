package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class PSATest {

    private static String columnDelimeter = ",";
    private static String lineDelimeter = "\n";
    private int columnToCheck;

    public int solution(String s, String c) {

        String[] strMass, massOfElements;
        strMass = s.split(lineDelimeter);
        massOfElements = strMass[0].split(columnDelimeter);
        columnToCheck = indexOfColumn(massOfElements, c);
        if (columnToCheck < 0) {
            System.out.println("Column not found");
            System.exit(0);
        }
        return getMaxElementsForColumn(strMass, columnToCheck);
    }

    private int indexOfColumn(String[] mass, String element) {

        for (int index = 0; index < mass.length; index++) {
            if (mass[index].equals(element))
                return index;
        }
        return -1;
    }

    private int getMaxElementsForColumn(String[] mass, int columnToCheck) {

        String[] lineElements;
        ArrayList<Integer> listOfElements = new ArrayList();
        for (int i = 1; i < mass.length; i++) {
            lineElements = mass[i].split(columnDelimeter);
            listOfElements.add(Integer.parseInt(lineElements[columnToCheck]));
        }
        Collections.sort(listOfElements);
        Collections.reverse(listOfElements);
        return listOfElements.get(0);
    }

}
