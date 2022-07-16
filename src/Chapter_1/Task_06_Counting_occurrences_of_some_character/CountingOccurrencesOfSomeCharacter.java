package Chapter_1.Task_06_Counting_occurrences_of_some_character;

/**
 * Подсчет появлений некоторого символа
 *
 */

public class CountingOccurrencesOfSomeCharacter {
    public static int countOccurrencesOfACertainCharacter(String str, char ch){
        return str.length() - str.replace(String.valueOf(ch), "").length();
    }

    public static void main(String[] args) {
        System.out.println(countOccurrencesOfACertainCharacter("Приветт", 'т'));

    }
}
