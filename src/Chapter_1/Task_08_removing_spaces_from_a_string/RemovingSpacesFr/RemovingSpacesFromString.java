package Chapter_1.Task_08_removing_spaces_from_a_string.RemovingSpacesFr;

/**
 * Удаление пробелов из строки
 * Используем  метод String.replaceAll(), с регулярным вырожение \s.
 * Удалим все пробелы, включая невидимые \t, \n, \r
 */
public class RemovingSpacesFromString {

    private static String remoteSpaces(String str){
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {

        System.out.println(remoteSpaces(" Тут    удалятся все  пробелы ! "));
    }
}
