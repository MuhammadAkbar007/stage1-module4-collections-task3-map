package com.epam.mjc.collections.map;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionValueFinderMain {
    public static void main(String[] args) {
        FunctionValueFinder finder = new FunctionValueFinder();
        System.out.println(finder.isFunctionValuePresent(new ArrayList<>(Arrays.asList(-1, 5, 4, 8)), 27));
    }
}
