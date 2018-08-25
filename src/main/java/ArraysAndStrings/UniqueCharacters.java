package ArraysAndStrings;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {
    public static void main(String[] args) {
        System.out.println(isUnique2("ee"));
    }

    public static boolean containsAllUniques(String string) {
        if (string == null) return false;

        Set<Character> uniquesCharacters = new HashSet<Character>();

        for (Character symbol : string.toLowerCase().toCharArray()) {
            if (!uniquesCharacters.contains(symbol)) {
                return false;
            }
            uniquesCharacters.add(symbol);
        }
        return true;//string.length() == uniquesCharacters.size();
    }

    public static boolean isUnique(String text) {

        if (text == null || text.length() < 1 || text.length() >= 33) return false;
        if (text.length() == 1) return true;

        Set<Character> uniqueCharacters = new HashSet<Character>();
        for (int i = 0; i <= text.length(); i++) {//for (Character symbol : text.toLowerCase().toCharArray()) {
            char symbol = text.charAt(i);
            if (!uniqueCharacters.contains(symbol)) {
                return false;
            }
            uniqueCharacters.add(symbol);
        }
        return true;
    }
    //check for null or empty string
    //check length ot incoming parameter.
    //check if the set has element -> false, else add

    public static boolean isUnique2(String text) {
        if(text == null || text.length() <1 || text.length() > 33) return false;
        if(text.length() == 1) return true;

        int[] uniqueCharacters = new int[50];
        for (Character ch: text.toLowerCase().toCharArray()) {

            byte position = (byte)(ch -'a');
            if(uniqueCharacters[position] != 0){
                return false;
            }
            uniqueCharacters[position] = 1;
        }
            return true;
    }


    public static boolean containsAllUniquesArray(String string) {
        if (string == null) return false;
        if (string.length() > 27) return false;
        byte[] uniquesCharacters = new byte[27];
        int i = 0;
        for (Character symbol : string.toCharArray()) {// aba
            byte position = (byte) (symbol - 'a');
            if (uniquesCharacters[position] == 0) {
                uniquesCharacters[position] = 1;
            } else {
                return false;
            }
        }
        return true;
    }


}
