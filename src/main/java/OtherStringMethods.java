/**
 * Official String documentation: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
 */
public class OtherStringMethods {
    /**
     * Substring will become an important part of solving puzzles with strings. It allows you to get part of a string
     * - eg, substring(0,3) of "banana" is "ban". (first number inclusive, second number exclusive.)
     * @param s the string to be manipulated
     * @param start the index of the start of the substring, inclusive.
     * @param end the index of the end of the substring, exclusive.
     * @return
     */
    public String partOfString(String s, int start, int end){
        String partOfStr = s.substring(start, end);
        return partOfStr;
    }

    /**
     * All classes have methods equals and toString because they inherit them from the Object class by extending the
     * Object class - how do we mandate that a class exhibits certain behaviors apart from those provided by the
     * Object class? The answer is interfaces. Strings implement the Comparable interface, which means that they have a
     * compareTo method. Strings' compareTo method compares Strings as if they're in a dictionary - ie, "cat" is
     * less than "dog". We can compare them as such as catString.compareTo(dogString).
     * @param s1 the first String to be compared.
     * @param s2 the second String to be compared.
     * @return a number greater than 0 if s1 > s2 lexigraphically, a number less than 0 is s1 < s2 lexigraphically,
     * and 0 if s1 is equivalent to s2.
     */
    public int compareLexigraphically(String s1, String s2) {
           int compare =  s1.compareTo(s2);
        return compare;
    }

    /**
     * The split method is useful for dividing a string into multiple strings, most notably for dividing a sentence
     * into its constituent words. For instance, if String sentence = "my favorite sentence", sentence.split(" ")
     * will return an array that contains {"my", "favorite", "sentence"}.
     * @param s1 the string to be manipulated.
     * @param splitAround the string that will be the text that s1 is split around (eg, for dividing a sentence into
     *                    words we use " ".
     * @return an array of Strings that represent s1 split by splitAround.
     */
    public String[] splitStringIntoMultipleStrings(String s1, String splitAround) {
        String [] arrStr = s1.split(splitAround);

        return arrStr;
    }
}
