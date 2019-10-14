package org.d3ifcool.widgetandroid;

import java.util.Random;

public class NumberGenerator {

    public static int Generate(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }

}
