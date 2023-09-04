package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
    double a = .03;
    double b = .042;

        System.out.println(a-b);

        BigDecimal numberOfPills = BigDecimal.valueOf(391);
        BigDecimal pillsPerBox = BigDecimal.valueOf(20);
        BigDecimal requiredBoxes = calculateNumberOfRequiredBoxes(numberOfPills, pillsPerBox);
        System.out.println(requiredBoxes);
    }
    private static BigDecimal calculateNumberOfRequiredBoxes(BigDecimal numberOfPills, BigDecimal pillsPerBox) {

        return numberOfPills.divide(pillsPerBox, RoundingMode.DOWN);
    }
}