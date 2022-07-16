package Chapter_1.Task_05_Counting_vowels_and_consonants;

import java.util.*;

/**
 * 	Подсчет гласных и согласных
 */
public class CountingVowelsAndConsonants {

    private static final Set<Character> allVowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public static Map<Integer, Integer> countVowelsAndConsonants(String str){
        str = str.toLowerCase();//привели значение строки  к  маленьким  символам
        int vowels = 0;
        int consonants = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);//разбили на массив
            if(allVowels.contains(ch)){
                vowels++;
            }
            else if((ch >= 'a' && ch <= 'z')){
                consonants++;
            }
        }
        return Map.of(vowels, consonants);
    }

    public static void main(String[] args) {

        System.out.println(countVowelsAndConsonants("ai, jhg"));
    }

}
