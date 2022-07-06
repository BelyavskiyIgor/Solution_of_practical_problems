package Chapter_1.Task_02_Finding_the_first_non_repeating_character;

/**
 * Поиск первого неповторяющегося символа
 */
public class FindingTheFirstNonRepeatingCharacter {
    private static final int EXTENDED_ASCII_CODES = 256;
    private static char firstNonRepeatedCharacter(String str){
        int[] flags = new int [EXTENDED_ASCII_CODES];

        for(int i = 0; i < flags.length;i++){
            flags[i] = -1;
        }

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(flags[ch] == -1){
                flags[ch] = i;
            }else {
                flags[ch] = -2;
            }
        }

        int position = Integer.MAX_VALUE;

        for(int i = 0; i < EXTENDED_ASCII_CODES; i++){
            if(flags[i] >= 0){
                position = Math.min(position, flags[i]);
            }
        }

        return position == Integer.MAX_VALUE ? Character.MIN_VALUE : str.charAt(position);
    }

    public static void main(String[] args) {
        char res = firstNonRepeatedCharacter("YYyvbbg");

        System.out.println(res);
    }
}
