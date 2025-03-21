import java.lang.StringBuilder;
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
        static String toCamelCase(String s) {
            String[] words = s.split("[-_]");
            StringBuilder result = new StringBuilder(words[0]);

            for (int i = 1; i < words.length; i++) {
                result.append(words[i].substring(0, 1).toUpperCase()).append(words[i].substring(1));
            }

            return result.toString();
        }
    }

