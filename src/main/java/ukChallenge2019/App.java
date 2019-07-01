package ukChallenge2019;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        int multiplier = 6;

        for (int numberToCheck = 10_000_000; numberToCheck <= 99_999_999; numberToCheck++) {

            //if (numberToCheck == 51_249_876) {

                if (containsOneOfEachDigit(numberToCheck, multiplier)) {
                    System.out.println("Yay!");
                    System.out.println("Number: " + numberToCheck);
                    System.out.println("Number * " + multiplier + ": " + numberToCheck * multiplier);
                }
           // }
        }

    }





    public static boolean containsOneOfEachDigit(int numberToCheck, int multiplier)
    {

        String numberToCheckStr = Integer.toString(numberToCheck);


        if(!check(numberToCheckStr, multiplier)) return false;

        String multipliedNumberStr = Integer.toString(numberToCheck * multiplier);

        if(!check(multipliedNumberStr)) return false;


        return true;
    }

    public static boolean check(String numberToCheck, int multiplier)
    {
        // Loop through all digits 1 to 9
        for (int digitToCheck = 1; digitToCheck <=9; digitToCheck++)
        {
            int count = StringUtils.countMatches(numberToCheck, Integer.toString(digitToCheck));

            // Ensure the multiplier digit is not in the number
            if (digitToCheck == multiplier)
            {

                if (count != 0) {
                    return false;
                }
            }
            else {
                if (count != 1) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean check(String numberToCheck)
    {
        // Loop through all digits 1 to 9
        for (int digitToCheck = 1; digitToCheck <=9; digitToCheck++)
        {
            int count = StringUtils.countMatches(numberToCheck, Integer.toString(digitToCheck));

                if (count != 1) {
                    return false;
                }

        }

        return true;
    }
}
