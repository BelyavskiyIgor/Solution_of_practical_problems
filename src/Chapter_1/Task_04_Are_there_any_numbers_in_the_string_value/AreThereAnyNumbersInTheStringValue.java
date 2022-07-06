package Chapter_1.Task_04_Are_there_any_numbers_in_the_string_value;

/**
 * 	Проверка, содержит ли строковое значение
 * только цифры
 */
public class AreThereAnyNumbersInTheStringValue {
    public static boolean containsOnlyDigits(String str){
        for(int i = 0;i < str.length(); i++){
            if(!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(containsOnlyDigits("д"));
    }
}
