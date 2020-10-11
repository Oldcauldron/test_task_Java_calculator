public class Calculator {
    public static void main(String[] args){

        String user_input = GetUserInput.start();

        /*
        //testing_data;
        String right_input_data[] = {"1+2", "  4  *3", " 10  / 2 ", "10 *10", "10 - 10",
                                "1-10", "10/10", "8/3", " i  + iii", "x * x", " v  iii*vi ii",
                                "iii - x", "x/i  i", "x/v ii i", "x *i v", "v-v"};
        String wrong_input_data[] = {"i+3", "x/2", "5/0", "12+10", "11-2", "a+b"};
        for(String user_input: right_input_data) {
        */

        String clear_string = StringConverter.clear_string(user_input);  // clear from spaces

        String[] arr = StringConverter.get_array_from_string(clear_string);

        arr = RomanianArabic.check_only_one_format(arr);

        arr = RomanianArabic.convert_roman_to_arabic(arr);  // arr = {"+", "a", "b", "format_label"}

        CheckExeptions.operand_more_than_ten(arr);  // and check for integer

        Integer result = Arithmetic.result(arr);

        GetUserOutput.finish(result, clear_string, arr);
//        } //for

    }
}
