package week01;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.sound.midi.MetaMessage;

import org.junit.Test;
import org.omg.Messaging.SyncScopeHelper;

public class Tasks {

	// ******** 8. Smallest multiple
	public static long getSmallestMultiple(int upperBound) {
	}

	// ******** 10. Grayscale image histogram
	public static int[] histogram(short[][] image) {
	}

	// ******** 12. Find the only number that occurs odd times in an array
	public static int getOddOccurrence(int[] array) {
		Map<Integer, Integer> hash = new HashMap<>();
		Object result = null;
		for (int i = 0; i < array.length; i++) {
			if (!hash.containsKey(array[i])) {
				hash.put(array[i], 1);
			} else {
				hash.put(array[i], hash.get(array[i]) + 1);
			}
		}
		hash.
		int k = hash.get(0);
		System.out.println(k);
		for (int j = 0; j<hash.size();j++){
			k = hash.get(j);
			if (k%2==1){
				result = getKeyFromValue(hash, k);
			}
		}
		return (int) result;
	}

	public static Object getKeyFromValue(Map hm, Object value) {
		for (Object o : hm.keySet()) {
			if (hm.get(o).equals(value)) {
				return o;
			}
		}
		return null;
	}

	// ******** 16. Rescale an image using nearest neighbour interpolation
	public static int[][] rescale(int[][] original, int newWidth, int newHeight) {
	}

	// ******** 26. Is String A an anagram of String B?
	public static boolean anagram(String A, String B) {
	}

	// ******** 27. Is an anagram of String A a substring in String B?
	public static boolean hasAnagramOf(String A, String B) {
	}

	// ******** 28. Convert to Greyscale
	// public static void convertToGrayscale(imgPath){}
	=======================================================


messageToNumbers(messsage)

This function takes a string - the message and returns the minimal keystrokes that you ned to write that message

Few examples:

messageToNumbers("abc") = [2, -1, 2, 2, -1, 2, 2, 2]
messageToNumbers("a") = [2]
messageToNumbers("Ivo e panda")
=
[1, 4, 4, 4, 8, 8, 6, 6, 0, 3, 3, 0, 1, 7, 2, 6, 6, 3, 2]
messageToNumbers("aabbcc") = [2, -1, 2, -1, 2, 2, -1, 2, 2, -1, 2, 2, 2, -1, 2, 2, 2]

34. Friday Years

Have you every wondered how many fridays are there in one year?

The count can be 52 or 53, depending on the weeks of that year (leap or not) and the start of the year.

If an year contains 53 fridays, we call that "A Friday Year"

You are to implement a function, called friday_years(String start, String end), where start and end are integers, representing years.

The function should return the count of all friday years between [start, end]

Examples:

    friday_years(1000, 2000) = 178
    friday_years(1753, 2000) = 44
    friday_years(1990, 2015) = 4

35. Credit card validation

Implement a function, called is_credit_card_valid(String number), which returns True/False based on the following algorithm:

    Each credit card number must contain odd count of digits.
    We transform the number with the following steps (based on the fact that we start from index 0)
        All digits, read from right to left, at even positions (index), remain the same.
        Every digit, read from right to left, at odd position is replaced by the result, that is obtained from doubling the given digit.
    After the transformation, we find the sum of all digits in the transformed number.
    The number is valid, if the sum is divisible by 10.

For example: 79927398715 is valid, bacause:

    When we double and replace all digits at odd position we get: 7 (18 = 2 * 9) 9 (4 = 2 * 2) 7 (6 = 2 * 3) 9 (16 = 2 * 8) 7 (2 = 2 * 1) 5
    The sum of all digits of the new number is 90, which is divisible by 10 => the card number is valid.

More examples:

    79927398715 is a valid number
    79927398713 is invalid number

36. Word from a^nb^n

Implement a function, called is_an_bn(word) that checks if the given word is from the a^nb^n for n>=0 language. Here, a^n means a to the power of n - repeat the character "a" n times.

Lets see few words from this language:

    for n = 0, this is the empty word ""
    for n = 1, this is the word "ab"
    for n = 2, this is the word "aabb"
    for n = 3, this is the word "aaabbb"
    and so on - first, you repeat the character "a" n times, and after this - repeat "b" n times

The function should return True if the given word is from a^nb^n for n>=0" for some n.
Test examples

    is_an_bn("") = True
    is_an_bn("hack") = False
    is_an_bn("aaabb") = False
    is_an_bn("aaabbb") = True
    is_an_bn("aabbaabb") = False
    is_an_bn("bbbaaa") = False
    is_an_bn("aaaaabbbbb") = True

37. Reduce file path

A file path in a Unix OS looks like this - /home/radorado/code/hackbulgaria/week0

We start from the root - / and we navigate to the destination fodler.

But there is a problem - if we have .. and . in our file path, it's not clear where we are going to end up.

    .. means to go back one directory
    . means to stay in the same directory
    we can have more then one / between the directories - /home//code

So for example : /home//radorado/code/./hackbulgaria/week0/../ reduces to /home/radorado/code/hackbulgaria.

Implement a function, called reduce_file_path(path) which takes a string and returns the reduced version of the path.

    Every .. means that we have to go one directory back
    Every . means that we are staying in the same directory
    Every extra / is unnecessary
    Always remove the last /

Test examples

    reduce_file_path("/") = "/"
    reduce_file_path("/srv/../") = "/"
    reduce_file_path("/srv/www/htdocs/wtf/") = "/srv/www/htdocs/wtf"
    reduce_file_path("/srv/www/htdocs/wtf") = "/srv/www/htdocs/wtf"
    reduce_file_path("/srv/./././././") = "/srv"
    reduce_file_path("/etc//wtf/") = "/etc/wtf"
    reduce_file_path("/etc/../etc/../etc/../") = "/"
    reduce_file_path("//////////////") = "/"
    reduce_file_path("/../") = "/"

38. Zero Insertion

Given an integer, implement the function int zero_insert(int n), which returns a new int, constructed by the following algorithm:

    If two neighboring digits are the same (like 55), insert a 0 between them (505)
    Also, if we add two neighboring digits and take their module by 10 (% 10) and the result is 0 - add 0 between them.

For example, if we have the number 116457, result will be: 10160457:

    1 and 1 are the same, so we insert 0 between them
    6 + 4 % 10 = 0, so we insert 0 between them.

Examples

    zero_insert(116457) = 10160457
    zero_insert(55555555) = 505050505050505
    zero_insert(1) = 1
    zero_insert(6446) = 6040406

    
			
	public static void main(String[] args) {
		int[] arr = { 4, 4, 4, 8, 8, 8, 6, 6, 6, 0, 3, 3, 0, 7, 7, 7, 7, 7, 2, 6, 6, 3, 2 };
		int[] arr1 = { 5, 2, 8, 8, 8, 2 };
		System.out.println(4 % 3);
		System.out.println(numbersToMessage(arr));

	}

}
