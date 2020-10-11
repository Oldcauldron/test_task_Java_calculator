public class GetUserOutput {
    public static void finish(Integer result, String clear_string, String[] arr){
        if(arr[3].equals("r")){
            String romanian_result = RomanianArabic.convert_arabic_to_roman(result);
            System.out.println(clear_string + "=" + romanian_result);
        } else {
            System.out.println(clear_string + " = " + result);
        }
    }
}
