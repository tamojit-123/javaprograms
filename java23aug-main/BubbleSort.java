//package com.niit.bubblesort;

public class BubbleSort {

    public int sortedDistances(int[] distances, String[] namesOfCities) {
        // write the logic to perform bubble sort on the distance
        // swap the namesOfCities also accordingly.
        // return 1 if the sorting is performed
        int n = distances.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (distances[j] <= 0)
                    return 0;
                else {
                    if (distances[j] > distances[j + 1]) {

                        int temp = distances[j];
                        distances[j] = distances[j + 1];
                        distances[j + 1] = temp;

                        String temp2 = namesOfCities[j];
                        namesOfCities[j] = namesOfCities[j + 1];
                        namesOfCities[j + 1] = temp2;
                    }
                }

            }
        }

        return 1;
    }

    public void printArray(int[] distances, String[] cityNames) {
        // iterate through the arrays and print the distance and cityNames
        int n3 = distances.length;
        for (int m = 0; m < n3 - 1; m++) {
            for (int o = 0; o < n3 - m - 1; o++) {
                System.out.println("cities from  zurich                  distance from zurich");
                System.out.println(cityNames[o] + "                        " + distances[o]);
            }
        }

    }

    public static void main(String[] args) {

        // Declare the array with city names
        String[] citiesFromZurich = { "Bern", "Lucerne", "InterLaken", "Grindelwald", "Engelberg", "Geneva", "Murren",
                "Basel", "Zermatt", "Jungfraujoch" };
        // Declare the array with distance from Zurich
        int[] distanceFromZurich = { 138, 52, 118, 136, 85, 276, 103, 87, 214, 101 };

        BubbleSort bubbleSort = new BubbleSort();

        // call the method 'sortedDistances' to sort the arrays based on distance
        bubbleSort.sortedDistances(distanceFromZurich, citiesFromZurich);

        // call the method 'printArray' to print the sorted arrays
        bubbleSort.printArray(distanceFromZurich, citiesFromZurich);
    }
}