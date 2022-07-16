package Chapter_1.Task_09_joining_multiple_strings_using_a_separator;

/**
 * Соединение нескольких строк с помощью разделителя
 */
public class JoiningMultipleStringsUsingSeparator {

    public static String joinByDelimiter( char delimiter, String...args){
        StringBuilder result = new StringBuilder();

        int i = 0;
        for(i = 0; i < args.length - 1; i++){
            result.append(args[i]).append(delimiter);
        }
        result.append(args[i]);
        return result.toString();
    }


}
