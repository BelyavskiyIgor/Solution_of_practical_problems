package Chapter_1.Task_03_Invert_letters_and_words;

/**
 * Инвертирование букв и слов
 */
public class InvertLettersAndWords {
    private static final String WHITESPACE = " ";
    public static String reverseWords(String str){
        String[] words = str.split(WHITESPACE);
        StringBuilder reversedString = new StringBuilder();

        for(String word : words){
            StringBuilder reverseWord = new StringBuilder();

            for(int i = word.length() - 1; i >=0; i--){
                reverseWord.append(word.charAt(i));
            }
            reversedString.append(reverseWord).append(WHITESPACE);
        }
        return reversedString.toString();
    }

    public static void main(String[] args) {
        String res = reverseWords("Привет мир !");
        System.out.println(res);
    }
}
