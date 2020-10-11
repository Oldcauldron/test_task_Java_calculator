public class StringConverter {

    public static String clear_string(String string_from_user){
        String cleared = string_from_user.replace(" ", "");
        cleared = cleared.toUpperCase();
        return cleared;
    }

    public static String[] get_array_from_string(String cleared_string){

        String letters_nums[] = cleared_string.split("[\\+|\\-|\\*|\\/]");
        CheckExeptions.correct_arithmetic_sign(letters_nums);

        String letters[] = cleared_string.split("");

        String arr[] = {"", letters_nums[0], letters_nums[1], ""};

        for(String sign: letters){
            arr[0] = sign.matches("[\\+|\\-|\\*|\\/]")?sign:arr[0];
        }

        return arr;
    }

    public static Integer[] convert_to_integer(String[] arr){
        Integer int_arr[] = new Integer[3];
        int_arr[1] = Integer.valueOf(arr[1]);
        int_arr[2] = Integer.valueOf(arr[2]);
        return int_arr;
    }


}
