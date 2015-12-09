package week01.Friday;

public class Problem33 {
	 
    public static int countClicks(int[] msg, int index) {
            int i = index;
            int count = 1;
            if (msg[index] == 0) {
                    return count;
            }
            while (i < msg.length - 1 && msg[i] == msg[i + 1]) {
                    count++;
                    i++;
            }
            return count;
    }

    public static char getChar(int clicks, int button) {
            char[][] key = { {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' },
                            { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };
            int buttonVal = key[button].length;
            int letterPosition = clicks % buttonVal;
            if (letterPosition == 0) {
                    return key[button][buttonVal - 1];
            }
            return key[button][letterPosition - 1];

    }

    public static String numbersToMessage(int[] msg) {
            StringBuilder result = new StringBuilder();
            boolean uppercase = false;
            for (int i = 0; i < msg.length; i++) {
                    int button = msg[i];
                    if (button == 0) {
                            result.append(" ");
                            continue;
                    } else if (button == 1) {
                            uppercase = true;
                            continue;
                    } else if (button == -1) {
                            continue;
                    }
                    int clicks = countClicks(msg, i);
                    char letter = getChar(clicks, button);
                    if (uppercase) {
                            letter = Character.toUpperCase(letter);
                            uppercase = false;
                    }
                    result.append(letter);
                    i += clicks - 1;
            }
            return result.toString();
    }

    public static void main(String[] args) {
            int[] arr = { 1, 4, 4, 4, 8, 8, 8, 6, 6, 6, 0, 3, 3, 0, 1, 7, 7, 7, 7, 7, 2, 6, 6, 3, 2 };
            int[] arr1 = { 2, -1, 2, 2, -1, 2, 2, 2 };
            System.out.println(numbersToMessage(arr));

    }
}