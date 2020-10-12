public class Calculator {
    public static void main(String[] args){

        String user_input = GetUserInput.start();

            /*
            //testing_data_block;
            String input_data[] = {
                "1+2", "  4  *3", " 10  / 2 ", "10 *10", "10 - 10",
                "1-10", "10/10", "8/3", " i  + iii", "x * x",
                " v  iii*vi ii", "iii - x", "x/i  i", "x/v ii i",
                "x *i v", "v-v", "i+3", "x/2", "5/0", "12+10",
                "11-2", "a+b", "q","1+2+3", "2 - 6/12",
                "-2-5 ++6", "1**4", "2++3"};
            for(String user_input: input_data) {
            */

        // clear from spaces
        String clear_string = StringConverter.clear_string(user_input);

        try {

            String[] arr = StringConverter.get_array_from_string(clear_string);

            String[] arr_checked_format = RomanianArabic.check_only_one_format(
                                                                          arr);

            String[] arr_converted_arabic;   // {"+", "a", "b", "format_label"}
            arr_converted_arabic = RomanianArabic.convert_roman_to_arabic(
                                                            arr_checked_format);

            //check for more than ten and check for integer
            CheckExeptions.operand_more_than_ten(arr_converted_arabic);

            Integer result = Arithmetic.result(arr_converted_arabic);

            GetUserOutput.finish(result, clear_string, arr_converted_arabic);

        } catch (Exception e) {
            System.out.println(user_input + " = " + e.getMessage());
        }

//          } //for

    } // main


} //class
