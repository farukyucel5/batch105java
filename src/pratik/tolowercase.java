package pratik;

public class tolowercase {

    public static void main(String[] args) {


        lCase("FARDDDDGGGbbbmOMbHJ");
    }

    public static void lCase(String sentence)
    {

        for (int i = 0; i < sentence.length(); i++) {

            int decimal_value=sentence.charAt(i);/*The decimal correspondence of a char in the decimal_value i is
            assigned to the variable called "decimal_value"                      */

            if(sentence.charAt(i)>='A' && sentence.charAt(i)<='Z')
            {
                /*
                In this code blog,the decimal_value equivalent of all uppercase letters is
                converted to that of lowercase letters.
                 */
                decimal_value=decimal_value +32; // The decimal value of a lowercase is 32 more than a uppercase.
            }

            char convertedChar= (char)decimal_value; //decimal_value of a char is converted to the char equivalent.

            System.out.print(convertedChar); // converted chars are printed.
        }
    }
}
