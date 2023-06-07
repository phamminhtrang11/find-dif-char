// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static String findDistinctCharacters(String input) {
        if (input == null || input.isEmpty()) {
            return " ";
        }
        StringBuilder result = new StringBuilder();
        char previousChar = result.charAt(0);
        result.append(previousChar);
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar != previousChar) {
                result.append(currentChar);
                currentChar = previousChar;
            }
        }
        return result.toString();
    }


    public static void main(String[] args) {
        String input1 = "aaabbbcdef";
        String input2 = "abbbced";
        String input3 = "acbcd";
        System.out.println(findDistinctCharacters(input1));
        System.out.println(findDistinctCharacters(input2));
        System.out.println(findDistinctCharacters(input3));


    }
}

