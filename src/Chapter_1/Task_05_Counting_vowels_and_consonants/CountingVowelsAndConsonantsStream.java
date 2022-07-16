package Chapter_1.Task_05_Counting_vowels_and_consonants;

import java.util.*;

public class CountingVowelsAndConsonantsStream {
    private static final Set<Character> allVowels = new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public static Map<Long, Long> countVowelsAndConsonants(String str){
        str = str.toLowerCase();
        long vowels = str.chars()
                .filter(c -> allVowels.contains((char) c))
                .count();

        long consonants = str.chars()
                .filter(x -> !allVowels.contains((char) x))
                .filter(ch -> (ch >= 'a' && ch <= 'z'))
                .count();

        return Map.of(vowels, consonants);
    }

    public static void main(String[] args) {
        System.out.println(countVowelsAndConsonants("G, EEEa"));
    }
}
