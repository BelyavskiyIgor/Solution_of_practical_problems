package Chapter_1.Task_03_Invert_letters_and_words;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Инвертирование букв и слов
 */
public class InvertLettersAndWordsStream {
    private static final Pattern PATTERN = Pattern.compile(" +");

    public static String reverseWords(String str){
        return  PATTERN.splitAsStream(str)
                .map(w -> new StringBuilder(w).reverse())
                .collect(Collectors.joining(" "));
    }

    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }


    public static void main(String[] args) {
        System.out.println(reverseWords("Привет мир "));
        System.out.println(reverse("Привет мир "));


    }
}
