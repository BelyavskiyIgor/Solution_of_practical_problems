package Chapter_1.Task_01_Counting_repeated_characters;

import java.util.HashMap;
import java.util.Map;

/**
 * Решение задачи подсчета символов в строке (включая специальные символы, такие
 * как #, $ и %) предусматривает взятие каждого символа и сравнение его с остальными.
 * Во время сравнения поддерживается состояние счета с помощью числового счетчика,
 * который увеличивается на единицу всякий раз, когда найден текущий символ.
 */
public class CountingRepeatedCharacters {
    public static Map<Character, Integer> countDuplicateCharacters(String str){
        Map<Character, Integer> result = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        return result;
    }
    public static void main(String[] args) {
        Map<Character, Integer> test = countDuplicateCharacters("Привеет");
        System.out.println(test);

    }
}
