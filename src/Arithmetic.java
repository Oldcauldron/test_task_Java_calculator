public class Arithmetic {

    public static Integer result(String[] arr){
        Integer int_arr[] = StringConverter.convert_to_integer(arr);
        int result_arr = 0;

        switch(arr[0]){
            case "+":
                result_arr =  int_arr[1] + int_arr[2];
                break;
            case "-":
                result_arr =  int_arr[1] - int_arr[2];
                break;
            case "*":
                result_arr =  int_arr[1] * int_arr[2];
                break;
            case "/":
                result_arr =  int_arr[1] / int_arr[2];
                break;
            default:
                CheckExeptions.something_wrong();
        }
        return result_arr;
    }














}
