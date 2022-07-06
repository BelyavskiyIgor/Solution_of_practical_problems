package Chapter_1.Task_01_Counting_repeated_characters;

import java.util.Map;
import java.util.stream.Collectors;

public class CountingRepeatedCharactersStream {
    public static Map<Character, Long> countDuplicateCharacter(String str){
        Map<Character, Long> result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return result;
    }
    public static void main(String[] args) {
        Map<Character, Long> res = countDuplicateCharacter("Привет");
        System.out.println(res);

    }
}
