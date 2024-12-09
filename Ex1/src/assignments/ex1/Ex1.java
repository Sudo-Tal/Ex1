package assignments.ex1;

/**
 * This class represents a simple solution for Ex1.
 * As defined here: https://docs.google.com/document/d/1AJ9wtnL1qdEs4DAKqBlO1bXCM6r6GJ_J/r/edit/edit
 * In this assignment, we will design a number formatting converter and calculator.
 * In general, we will use Strings as numbers over basis of binary till Hexa.
 * [2-16], 10-16 are represented by A,B,..G.
 * The general representation of the numbers is as a String with the following format:
 * <number><b><base> e.g., “135bA” (i.e., “135”, as 10 is the default base), “100111b2”, “12345b6”,”012b5”, “123bG”, “EFbG”.
 * The following are NOT in the format (not a valid number):
 * “b2”, “0b1”, “123b”, “1234b11”, “3b3”, “-3b5”, “3 b4”, “GbG”, "", null,
 * You should implement the following static functions:
 */
public class Ex1 {
    static String NumPart;
    static String BasePart;

    public static void main(String[] args) {


    }

    /**
     * Convert the given number (num) to a decimal representation (as int).
     * If the given number is not in a valid format returns -1.
     *
     * @param num a String representing a number in basis [2,16]
     * @return
     */

    public static int number2Int(String num) {
        int ans = -1;
        if (isNumber(num)) {

            int Separator = num.indexOf('b');
            if (Separator != -1) {
                NumPart = num.substring(0, Separator);
                BasePart = num.substring(Separator + 1);
            } else {
                //If b is not found, set NumPart to entire string and BasePart to "A"
                NumPart = num;
                BasePart = "A";
            }

            if (BasePart.equals("A")) BasePart = "10";
            if (BasePart.equals("B")) BasePart = "11";
            if (BasePart.equals("C")) BasePart = "12";
            if (BasePart.equals("D")) BasePart = "13";
            if (BasePart.equals("E")) BasePart = "14";
            if (BasePart.equals("F")) BasePart = "15";
            if (BasePart.equals("G")) BasePart = "16";


            int num1 = Integer.parseInt(NumPart, Integer.parseInt(BasePart));

            ans = num1;
        }
        return ans;
    }


    /**
     * This static function checks if the given String (num) is in a valid "number" format.
     *
     * @param num String representing a number
     * @return true iff the given String is in a number format
     */
    public static boolean isNumber(String num) {
        boolean ans = true;
        if (num == null || num.isEmpty()) return false;
        if (num.equals("b")) return false;

        int Separator = num.indexOf('b');
        if (Separator != -1) {
            NumPart = num.substring(0, Separator);
            BasePart = num.substring(Separator + 1);
        } else {
            //If b is not found, set NumPart to entire string and BasePart to "A"
            NumPart = num;
            BasePart = "A";
        }
        //validity check NumPart
        boolean NumValid = true;
        if (NumPart == null || NumPart.isEmpty()) {
            NumValid = false;
            return false;
        }
        for (int i = 0; i < NumPart.length(); i++) {
            if (NumPart.charAt(i) != '0'
                    && NumPart.charAt(i) != '1'
                    && NumPart.charAt(i) != '2'
                    && NumPart.charAt(i) != '3'
                    && NumPart.charAt(i) != '4'
                    && NumPart.charAt(i) != '5'
                    && NumPart.charAt(i) != '6'
                    && NumPart.charAt(i) != '7'
                    && NumPart.charAt(i) != '8'
                    && NumPart.charAt(i) != '9'
                    && NumPart.charAt(i) != 'A'
                    && NumPart.charAt(i) != 'B'
                    && NumPart.charAt(i) != 'C'
                    && NumPart.charAt(i) != 'D'
                    && NumPart.charAt(i) != 'E'
                    && NumPart.charAt(i) != 'F'
                    && NumPart.charAt(i) != 'G') {
                NumValid = false;
                break;
            }
        }
        //validity check BasePart
        boolean BaseValid = true;
        if (BasePart == null || BasePart.isEmpty()) return false;

        if (BasePart == null || BasePart.isEmpty()) {
            BaseValid = false;
            return false;
        }

        if (BasePart.length() != 1 || !"23456789ABCDEFG".contains(BasePart)) {
            BaseValid = false;
        }

        //range check for NumPart against BasePart
        boolean RangeValid = true;
        char BaseChar = BasePart.charAt(0);

        int base = Character.digit(BaseChar, 17);

        for (int i = 0; i < NumPart.length(); i++) {

            char NumChar = NumPart.charAt(i);
            int Value = Character.digit(NumChar, 17); // Get numeric value of the character in base 16 (covers smaller bases as well)


            if (Value == -1 || Value >= base) {
                RangeValid = false; // Invalid character for the given base
            }
        }

        ans = NumValid && BaseValid && RangeValid;

        return ans;
    }

    /**
     * Calculate the number representation (in basis base)
     * of the given natural number (represented as an integer).
     * If num<0 or base is not in [2,16] the function should return "" (the empty String).
     *
     * @param num  the natural number (include 0).
     * @param base the basis [2,16]
     * @return a String representing a number (in base) equals to num, or an empty String (in case of wrong input).
     */
    public static String int2Number(int num, int base) {
        String ans = "";
        String BaseResult = "";
        String ReversedResult = "";

        if (num >= 0 && (base >= 2 && base <= 16)) {

            if (num == 0) {
                return "0";
            }
            while (num > 0) {
                int remainder = num % base;
                BaseResult = BaseResult + remainder;  // Append the remainder to the result
                num /= base;  // Divide the number by the base
            }
            // Reverse the string
            for (int i = BaseResult.length() - 1; i >= 0; i--) {
                ReversedResult += BaseResult.charAt(i);
            }

            ReversedResult = ReversedResult + "b" + base;
            ans = ReversedResult;


        }
        return ans;
    }

    /**
     * Checks if the two numbers have the same value.
     *
     * @param n1 first number
     * @param n2 second number
     * @return true iff the two numbers have the same values.
     */
    public static boolean equals(String n1, String n2) {
        boolean ans = number2Int(n1) == number2Int(n2);

        return ans;
    }

    /**
     * This static function search for the array index with the largest number (in value).
     * In case there are more than one maximum - returns the first index.
     * Note: you can assume that the array is not null and is not empty, yet it may contain null or none-valid numbers (with value -1).
     *
     * @param arr an array of numbers
     * @return the index in the array in with the largest number (in value).
     */
    public static int maxIndex(String[] arr) {
        int ans = 0;
        int MaxValue = 0;

        for (int i = 1; i < arr.length; i++) {
            if (number2Int(arr[i]) > number2Int(arr[MaxValue])) {
                MaxValue = i;
            }

        }
        ans = MaxValue;
        System.out.println(ans);
        return ans;
    }
}
