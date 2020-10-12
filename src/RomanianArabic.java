public class RomanianArabic {

    static String roman_list[] = {
        "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    static String for_check_big_roman[] = {"I", "V", "X", "L", "C"};


    public static Boolean check_romanian_more_than_ten(String[] arr){
        Boolean this_romans[] = {false, false};
        for(int i = 1; i < 3; i++){
            String divided_roman[] = arr[i].split("");
            for(String big_roman: for_check_big_roman){
                if(divided_roman.length > 0 && divided_roman[0].equals(big_roman))
                    { this_romans[i-1] = true; }
            }
        }
        if(this_romans[0] && this_romans[1]) return true;
        return false;
    }

    public static String[] check_only_one_format(String[] arr){

        Boolean rome_test[] = {false, false};  //true - roman, false - arabic
        for(String rome_number : roman_list){
            rome_test[0] = arr[1].matches(rome_number) || rome_test[0];
            rome_test[1] = arr[2].matches(rome_number) || rome_test[1];
        }

        if(arr[1].matches("\\d{1,2}") && arr[2].matches("\\d{1,2}")){
            arr[3] = "a";  // arabian checker
        } else if(rome_test[0] && rome_test[1]){
            arr[3] = "r";  // romanian checker
        } else if(arr[1].matches("\\d{1,2}") || arr[2].matches("\\d{1,2}")) {
            CheckExeptions.mixed_arabic_and_romes();
        } else if(RomanianArabic.check_romanian_more_than_ten(arr)){
            CheckExeptions.one_romanian_more_than_ten();
        }else{
            CheckExeptions.number_format_exception();
        }
        return arr;
    }



    public static String[] convert_roman_to_arabic(String[] arr){

        if(arr[3].equals("a")){return arr;};

        for(int i = 1; i < roman_list.length; i++){
            String str_i = Integer.toString(i);
            arr[1] = arr[1].equals(roman_list[i])?str_i:arr[1];
            arr[2] = arr[2].equals(roman_list[i])?str_i:arr[2];
        }
        return arr;
    }


    public static String convert_arabic_to_roman(Integer num) {
        String roman_result = new String();
        Boolean negative_number = false;

        if(num < 0){
            num += (-2*num);
            negative_number = true;
        }

        if(num < 10){
            roman_result = roman_list[num];
        } else if(num >= 10 && num < 20) {
            roman_result = "X" + (roman_list[num - 10]);
        } else if(num >= 20 && num < 30) {
            roman_result = "XX" + (roman_list[num - 20]);
        } else if(num >= 30 && num < 40) {
            roman_result = "XXX" + (roman_list[num - 30]);
        } else if(num >= 40 && num < 50) {
            roman_result = "XL" + (roman_list[num - 40]);
        } else if(num >= 50 && num < 60) {
            roman_result = "L" + (roman_list[num - 50]);
        } else if(num >= 60 && num < 70) {
            roman_result = "LX" + (roman_list[num - 60]);
        } else if(num >= 70 && num < 80) {
            roman_result = "LXX" + (roman_list[num - 70]);
        } else if(num >= 80 && num < 90) {
            roman_result = "LXXX" + (roman_list[num - 80]);
        } else if(num >= 90 && num < 100) {
            roman_result = "XC" + (roman_list[num - 90]);
        } else if(num == 100) {
                roman_result = "C";
        } else {CheckExeptions.something_wrong();}

        roman_result = negative_number?"MINUSUS "+roman_result:roman_result;
        return roman_result;
    }















}
