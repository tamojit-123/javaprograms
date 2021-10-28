package com.niit.sortwords;

/* Write a Java program to sort all of the words in the list in alphabetical order and display */
public class SortWords {
    public static void main(String[] args) {
        String[] words = {};

        SortWords sortWords = new SortWords();
        sortWords.sort(words);
        // Call method to sort words alphabetically
        String[] sortedWords = sortWords.sort(words);

        // Display the words after sorting alphabetically
        for(int i=0;i<words.length;i++){
        System.out.println(words[i]);
        }
    }

    // Function to sort words in an array in alphabetical order
    public String[] sort(String[] words) {
        String temp="";
        for (int j = 0; j < words.length; j++) 
        {
            for (int k = j + 1; k < words.length; k++) { 
                
                if (words[j].compareTo(words[k])>0) 
                {    
                    temp = words[j];
                    words[j]= words[k];
                    words[k] = temp;
                }
            }
        
    }return words;
}
}