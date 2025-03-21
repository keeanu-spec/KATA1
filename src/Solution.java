import java.lang.StringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
    /**
     * Class with method to work  with String
     * @method: static String toCamelCase(String s)
     *
     * Complete the method/function so that it converts dash/underscore
     * delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).
     * The next words should be always capitalized.
     */
    class Solution {
        /**
         *
         * @param  String s
         * @return  result.toString();
         * @examples "the-stealth-warrior" gets converted to "theStealthWarrior"
         *
         * "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
         *
         * "The_Stealth-Warrior" gets converted to "TheStealthWarrior"
         */
            static String toCamelCase(String s){
                return Pattern.compile("[-|_](.)").matcher(s).replaceAll(r -> r.group(1).toUpperCase());
            }
        }



