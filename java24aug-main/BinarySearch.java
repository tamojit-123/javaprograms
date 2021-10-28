package com.niit.binarysearch;


public class BinarySearch {
    // Declare a variable to track the number of comparisons within the array
   
    static int numberOfComparisons = 0;
    public static void main(String[] args) {

        // Declare arrays cityNames and distances
        // Note that the arrays must be in sorted order
        String cityNames[] = {"Lucerne", "Engelberg", "Basel", "Jungfraujoch", "Murren", "InterLaken", "Grindelwald", "Bern", "Zermatt", "Geneva"};
        int distances[] = {52, 85, 87, 101, 103, 118, 136, 138, 214, 276};

        // Declare the variable with the distance to be searched
        int distanceToBeSearched = 52;

        BinarySearch binarySearch = new BinarySearch();
        // Call the method to search the array
        binarySearch.search(distances,cityNames,distanceToBeSearched);
        String result = null;

        // print the result
         System.out.println(result);
    }

    // Function to search the city at 52 kms from Zurich
    public String search(int[] distanceArray,String cityNames[], int distanceFromZurich) {
        int first=0;int t=distanceArray.length;
           int last=t-1;
           String cn="";
         
            int mid = (first+last)/2;  
            while( first <= last &&distanceFromZurich==52){  
            if ( distanceArray[mid] < distanceFromZurich ){  
            first = mid + 1;   
            for(int i=first;i<distanceArray.length;i++)
            {
                if(distanceArray[i]==distanceFromZurich)
                cn=cityNames[i];
                numberOfComparisons=i;
                return cn;
                
            }

            }
            else if ( distanceArray[mid] == distanceFromZurich )
            {  
            cn=cityNames[mid];
            numberOfComparisons=mid;
            return cn;
           
        
      }
      else
      {  
         last = mid - 1; 
         for(int j=0;j<last;j++) {
            if(distanceArray[j]==distanceFromZurich)
                cn=cityNames[j];
                numberOfComparisons=j; 
                return cn; 
         }
      }  
      mid = (first + last)/2;  
    }   
   
           
        

 return "City Not Found" ;      }
}