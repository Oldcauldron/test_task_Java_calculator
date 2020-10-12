public class GetUserOutput {
    public static void finish(Integer result, String clear_string, String[] arr){
        if(arr[3].equals("r")){
            String romanian_result = "DEUM NOLIUS (O)";  // if result == 0;

            if(result <= 0){
                System.out.println(
                    "К сожалению римляне не додумались до нуля "+
                    "или отрицательных чисел. Поэтому ответа тут нет.." +
                    "Но если бы они до них додумались, то было бы что то" + 
                    "вроде...");
            }
            if(result != 0) {
                romanian_result = RomanianArabic.convert_arabic_to_roman(result);
            }
            System.out.println(clear_string + "=" + romanian_result);
        } else {
            System.out.println(clear_string + " = " + result);
        }
    }
}
