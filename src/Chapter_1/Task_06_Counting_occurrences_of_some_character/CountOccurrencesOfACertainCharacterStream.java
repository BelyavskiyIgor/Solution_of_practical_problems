package Chapter_1.Task_06_Counting_occurrences_of_some_character;

public class CountOccurrencesOfACertainCharacterStream {
    public static int countOccurrencesOfACertainCharacter(String str, char ch){
        return (int) str.chars().filter(c-> c == ch).count();
    }

    public static void main(String[] args) {
        System.out.println(countOccurrencesOfACertainCharacter("pppprivett", 'p'));
    }
}
