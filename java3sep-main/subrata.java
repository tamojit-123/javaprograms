package com.niit.averageofintegers;


public class subrata
{
    //This function calculates the average age, takes as input the raw data array
    // handle the exception appropriately
    public String averageAgeCalculator(String[] ageRawData)
    {

        int[] array = new int[ageRawData.length];
      double total=0;
       try
        {
            for(int i=0;i<array.length;i++)
            {
                array[i] = Integer.parseInt(ageRawData[i]);
            }

            for (int i = 0; i < array.length; i++) 
            {
                total += array[i];
            }

        } catch (NumberFormatException e) {
            return e.toString();
        }
        return Double.toString(total / array.length);
    } 
}