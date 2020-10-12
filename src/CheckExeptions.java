public class CheckExeptions {

    public static void correct_arithmetic_sign(String[] letters_nums){
        if(letters_nums.length != 2){
            throw new UnsupportedOperationException(
                                        "incorrect arithmetic sign!");
        }
    }

    public static void mixed_arabic_and_romes(){
        throw new UnsupportedOperationException(
                "This is not correct! Only roman or only arabic numbers");
    }

    public  static void number_format_exception(){
        throw new UnsupportedOperationException(
                                        "One of operand is not number!");
    }

    public static void operand_more_than_ten(String [] arr){
        if (Integer.valueOf(arr[1]) > 10 || Integer.valueOf(arr[2]) > 10) {
                throw new UnsupportedOperationException(
                                            "One of operand more than 10!");
        }
    }

    public static void something_wrong(){
        throw new UnsupportedOperationException(
                                    "Something really wrong with results...");
    }


    public static void one_romanian_more_than_ten(){
        throw new UnsupportedOperationException(
                                    "One of romanian operand more than 10!");
    }













}
