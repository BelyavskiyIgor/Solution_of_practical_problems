package Chapter_1.Task_07_Converting_a_string_to_an_integer_value;

/**
 * 	Конвертирование строки в значение типа int, long, float или double
 */
public class ConvertingAStringToAnIntegerValue {
    private static final String TO_INT = "453";
    private static final String TO_LONG = "45234223233";
    private static final String TO_FLOAT = "45.823F";
    private static final String TO_DOUBLE = "13.8343D";

    public static void main(String[] args) {
        int num = Integer.parseInt(TO_INT);
        Integer num1 = Integer.valueOf(TO_INT);
        System.out.println(num);
        System.out.println(num1);
    }
}
