package ArraysAndStrings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



public class Tasks {

    public static void main(String[] args) {
//        System.out.println(isPermutation2Solution("qew", "qw"));
        replace("I    II  ");
    }


    public static boolean isPermutation(String str1, String str2) { //qwe - ewq - weq
        if (str1 == null || str2 == null || str1.equals("") || str2.equals("")
                || str1.length() != str2.length()) return false;

        char[] aStr1 = str1.toCharArray();
        char[] aStr2 = str2.toCharArray();

        Arrays.sort(aStr1);
        Arrays.sort(aStr2);

        return Arrays.equals(aStr1, aStr2);
    }

    public static boolean isPermutation2Solution(String str1, String str2) {
        if (str1 == null || str2 == null || str1.equals("") || str2.equals("")
                || str1.length() != str2.length()) return false;

        int[] letters = new int[256];

        for (char symbol : str1.toCharArray()) {
            letters[symbol]++;
        }

        for (char symbol : str2.toCharArray()) {
            if (letters[(int) symbol] < 0) {
                return false;
            }

        }
        return true;
    }

    public static void removeDuplicates(int[] arrayWithDupl) {
        Set uniqueRepository = new HashSet<Integer>();

        for (int i : arrayWithDupl) {
            uniqueRepository.add(i);
        }
        System.out.println(uniqueRepository);
    }

    public static void removeDuplicatesWithOutExtraMemory(int[] incomeArray) { //0,1,1,2,3,4,4,4,4
        Arrays.sort(incomeArray);//0,1,1,1,2,3,4,4
        int previous = incomeArray[0]; //0
        int length = incomeArray.length; //7
        int[] newMass = new int[7];
//        p!=c?
//            y	 ->	p = c
//              n	dell c	c = c+1
        for (int current = 1; current <= incomeArray.length; current++) { //0,1,1
            if (current == length) break;
            if (previous == incomeArray[current]) {//0==1//1==1//1==2
//                newMass = ArrayUtils.removeElements(incomeArray,incomeArray[current]); todo recursion
                incomeArray[current] = 0;
//                --length;
                continue;
            }
            previous = incomeArray[current]; //1
        }
        System.out.println(Arrays.toString(incomeArray));
        System.out.println(Arrays.toString(newMass));
//        public void removeElement(Object[] arr, int removedIdx) {
//            System.arraycopy(arr, removedIdx + 1, arr, removedIdx, arr.length - 1 - removedIdx);
//        }
//        https://stackoverflow.com/questions/26360865/how-to-use-arrayutils-for-array-of-objects-it-doesnt-deleted-the-content-of-an
    }

    public static int[] removeDuplicatesWithOutExtraMemoryRec(int[] array, int prev) {

        if (array.length <= 1) {
            return array;
        }

        //return removeDuplicatesWithOutExtraMemory(ArrayUtils.remove(i),array[i]); todo не знаю як зробити через рекурсію


//        System.out.println(Arrays.toString(incomeArray));
//        System.out.println(Arrays.toString(newMass));

//        public void removeElement(Object[] arr, int removedIdx) {
//            System.arraycopy(arr, removedIdx + 1, arr, removedIdx, arr.length - 1 - removedIdx);
//        }
//        https://stackoverflow.com/questions/26360865/how-to-use-arrayutils-for-array-of-objects-it-doesnt-deleted-the-content-of-an
        return null;
    }

    public static int[] remRec(int[] array, int prev) {
        int[] newMass = new int[7];
        for (int current = 1; current <= array.length; current++) {
            if (current == array.length) break;
            if (prev == array[current]) {
//                incomeArray[current] = 0;
                continue;
            }
            prev = array[current]; //1
        }
//        System.out.println(Arrays.toString(incomeArray));
        System.out.println(Arrays.toString(newMass));

//        public void removeElement(Object[] arr, int removedIdx) {
//            System.arraycopy(arr, removedIdx + 1, arr, removedIdx, arr.length - 1 - removedIdx);
//        }
//        https://stackoverflow.com/questions/26360865/how-to-use-arrayutils-for-array-of-objects-it-doesnt-deleted-the-content-of-an
        return null;
    }

    public static void replace(String str) {
        char[] strArray = str.toCharArray();

        StringBuilder result = new StringBuilder();

        String res = str.replace(" ", "%20");
//        for(String s : str.split(" ")){
//            result.append(s).append("%20");
//
//        }

//        for (int i = 0; i < strArray.length; i++) {
//            if (strArray[i] == ' ') {
//                strArray[i] = '%20';
//            }
//        }
            System.out.print(res);
    }

}
