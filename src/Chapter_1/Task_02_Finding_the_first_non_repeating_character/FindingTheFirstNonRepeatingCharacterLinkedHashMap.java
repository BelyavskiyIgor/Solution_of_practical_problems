package Chapter_1.Task_02_Finding_the_first_non_repeating_character;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Поиск первого неповторяющегося символа
 */

public class FindingTheFirstNonRepeatingCharacterLinkedHashMap {
    public static char firstNonRepeatedCharacter(String str){
        Map<Character, Integer> chars = new LinkedHashMap<>();

        for(int i = 0; i < str.length(); i++ ){
            char ch = str.charAt(i);
            chars.compute(ch, (c, v) -> v == null ? 1 : ++v);
        }

        for(Map.Entry<Character, Integer> entry: chars.entrySet()){
            if(entry.getValue() == 1 ){
                return entry.getKey();
            }
        }

        return Character.MIN_VALUE;
    }

    public static void main(String[] args) {
        char c = firstNonRepeatedCharacter("1234");
        System.out.println(c);
    }

}
