package com.niit.palindrome;
import java.util.*;

/* Write a java program to find if any of the words in the list is a palindrome or not, print their count and the palindrome words.*/
public class Palindrome {
    public static void main(String[] args) {
        String[] words = {};
        Palindrome palindrome = new Palindrome();
        palindrome.findPalindromeWords(words);

        // Call method to find palindromes in array of words
        System.out.println("Total number of palindromes: " + palindrome.findPalindromeWords(words));
    }

    
    public int findPalindromeWords(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++)
        {
        char[] chArray = words[i].toCharArray();
        int size = chArray.length;
      char[] chGiven = Arrays.copyOf(chArray, chArray.length);
      for(int j = 0; j < size / 2; j++) 
      {
         char temp = chArray[j];
         chArray[j] = chArray[size - j - 1];
         chArray[size - j - 1] = temp;
      }
     
      if(Arrays.equals(chArray, chGiven)) 
    count++;
        }
 return count; 
    }
}

// package com.niit.palindrome;

// /* Write a java program to find if any of the words in the list is a palindrome or not, print their count and the palindrome words.*/
// public class Palindrome {
//     public static void main(String[] args) {
//         String[] words = {"civic", "root", "program", "level"};
//         Palindrome palindrome = new Palindrome();

//         // Call method to find palindromes in array of words
        
//         System.out.println("Total number of palindromes: " + palindrome.findPalindromeWords(words));
//     }


//     // Function to find palindromes in an array of words
//     public int findPalindromeWords(String[] str) {
//         int count=0;
//             for(int i=0;i<str.length;i++)
// 		{
// 			String original=str[i];
// 			StringBuilder reverse=new StringBuilder();
// 			reverse.append(original);
// 			reverse.reverse();
// 			System.out.println(reverse);
// 			if(original.equals(reverse.toString()))
// 			{
// 				count++;
				
// 			}
//         }
//         return count;

//     }
// }