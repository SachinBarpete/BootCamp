package com.bridgelabz.day10;

import com.bridgelabz.day10.AnagramArr;
import com.bridgelabz.day10.PalindromeArr;

public class Main {

    public static void main(String[] args) {
        AnagramArr anagramArr = new AnagramArr();
        PalindromeArr palindromeArr = new PalindromeArr();
        anagramArr.storeNums();
        anagramArr.storePrimes();
        anagramArr.storeAnagrams();

        anagramArr.displayNumbers();
        anagramArr.displayPrimes();
        anagramArr.displayAnagrams();
        
        palindromeArr.storePalindrome();
        palindromeArr.displayPalindrome();
    }
}
