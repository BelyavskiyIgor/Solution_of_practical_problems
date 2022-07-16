package Chapter_1.Task_06_Counting_occurrences_of_some_character;

/**
 * перебор
 * строковых символов (в одном цикле) и сравнении каждого символа с заданным символом,
 * при этом нужно увеличивать счетчик на единицу для каждого совпадения:
 */
public class CountOccurrencesOfACertainCharacterEnumeration {

    public static int countOccurrencesOfACertainCharacter(String str, char ch){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOccurrencesOfACertainCharacter("Priveeet", 'e'));
    }
}
