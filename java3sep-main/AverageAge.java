package com.niit.averageofintegers;


public class AverageAge {
    //This function calculates the average age, takes as input the raw data array
    // handle the exception appropriately
    public String averageAgeCalculator(String[] ageRawData) {

        int[] ageArray = new int[ageRawData.length];

        double sum = 0;
        try {
            for (int i = 0; i < ageArray.length; i++) {
                ageArray[i] = Integer.parseInt(ageRawData[i]);
            }
            for (int i = 0; i < ageArray.length; i++) {
                sum += ageArray[i];
            }

        } catch (NumberFormatException e) {
            return e.toString();
        }
        return Double.toString(sum / ageArray.length);
    }
}