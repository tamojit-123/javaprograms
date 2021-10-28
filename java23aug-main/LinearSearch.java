import java.util.*;

public class LinearSearch {
    // Calculates total number of comparisons made while searching a number in an
    // array
    // using linear search algorithm
    static int totalComparisons = 0;

    // This function returns the name of the city that is at a given distance from
    // Zurich.
    // If the city is not found a message is returned instead of the name of the
    // city

    public String findCity(int[] distances, String[] cities, int distanceToSearch) {

        int i = 0;
        totalComparisons = 0;
        while (i < distances.length) {

            totalComparisons = +1;
            if (distanceToSearch == distances[i]) {

                return cities[i];

            }
            i += 1;
        }
        return "not found";
    }

    public String[] findCityAtDistanceGreaterThan270(int[] distances, String[] cities, int distanceToSearch) {

        int i = 0;
        distanceToSearch = 270;
        while (i < distances.length) {

            if (distances[i] > distanceToSearch) {
                System.out.println(cities[i]);
            }
            totalComparisons += 1;
            i += 1;
        }
        return new String[] { "not found" };
    }

    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        // Declare the array for cities
        String[] citiesFromZurich = { "Bern", "Lucerne", "InterLaken", "Grindelwald", "Engelberg", "Geneva", "Murren",
                "Basel", "Zermatt", "Jungfraujoch" };
        // Declare the array with distance from Zurich
        int[] distanceFromZurich = { 138, 52, 118, 136, 85, 276, 103, 87, 214, 101 };

        // call the method 'findCity'
        String cityFound = linearSearch.findCity(distanceFromZurich, citiesFromZurich, 52);
        System.out.println(cityFound);
        System.out.println(totalComparisons);
        String citiesAtDistanceGreaterThan270[] = linearSearch.findCityAtDistanceGreaterThan270(distanceFromZurich,
                citiesFromZurich, 270);
        System.out.println(citiesAtDistanceGreaterThan270);

        // print the city name that is equal to the distanceToSearch

        // print the number of comparisons within the array until the city is found

        // call the method 'findCityAtDistanceGreaterThan270'

        // print all cities that are greater than 270 kms away from Zurich

    }
}