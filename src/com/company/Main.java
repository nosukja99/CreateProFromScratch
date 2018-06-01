package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static double width=0;
    private static double height=0;
    private static int numOfInchRainfall=0;
    private static double numWaterGallon=0;

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("o.##");
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the roof width: ");
        width = in.nextDouble();
        System.out.println("Please enter the roof height: ");
        height = in.nextDouble();
        System.out.println("Please enter the number of rainfall in inch: ");
        numOfInchRainfall = in.nextInt();
        numWaterGallon = CalculateRufoffWater(width, height, numOfInchRainfall);
        System.out.println("The amount of runoff water in gallon is "+ df.format(numWaterGallon));
    }


    private static double CalculateRufoffWater(double width, double height, int numOfInchRainfall) {
        double numWaterGallon = ((width*123)*(height*12)*numOfInchRainfall)/231;
        return numWaterGallon;
    }
}
