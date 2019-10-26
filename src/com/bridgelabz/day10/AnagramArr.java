package com.bridgelabz.day10;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramArr extends PrimeArr{
    private static List <List<Integer>> anagramNumbers = new ArrayList<>();

    public void storeAnagrams (){
        for (List<Integer> temp : primeNumbers) {
            List<Integer> anagramList = new ArrayList<>();
            for (int j = 0; j < temp.size() - 1; j++) {
                int num1 = temp.get(j);

                for (int k = j + 1; k < temp.size(); k++) {
                    int num2 = temp.get(k);

                    if (isAnagram(num1, num2)) {
                        if (!anagramList.contains(num1))
                            anagramList.add(num1);
                        if (!anagramList.contains(num2))
                            anagramList.add(num2);
                    }
                }
            }
            if (anagramList.size() != 0)
                anagramNumbers.add(anagramList);
        }
    }

    private boolean isAnagram(int num1, int num2) {
        int [] digits1 = new int[3];
        int [] digits2 = new int[3];
        int i= 0;
        while (num1 != 0){
            digits1[i++] = num1 % 10;
            num1 /= 10;
        }
        i = 0;
        while (num2 != 0){
            digits2[i++] = num2 % 10;
            num2 /= 10;
        }
        Arrays.sort(digits1);
        Arrays.sort(digits2);

        for (i = 0; i < 3; i++) {
            if (digits1[i] != digits2[i])
                return false;
        }
        return true;
    }

    public void displayAnagrams(){
        System.out.println("-----------------Anagram numbers--------------");
        for (List<Integer> anagramNumber : anagramNumbers) {
            for (Integer elements : anagramNumber) {
                System.out.print(elements + "  ");
            }
            System.out.println();
        }
    }
}