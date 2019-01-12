package com.khoi;
import com.khoi.AreaCalculator;

import java.awt.geom.Area;

/**
 * Created by khoi on Jan, 2019
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(AreaCalculator.area(5.0));
        System.out.println(AreaCalculator.area(-1));
        System.out.println(AreaCalculator.area(5.0, 4.0));
        System.out.println(AreaCalculator.area(-1.0, 4.0));
    }
}
