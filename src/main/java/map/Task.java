package map;

import java.util.ArrayList;
import java.util.HashMap;

public class Task {


    public ArrayList<String> merge(String[] words, String[] more) {
        ArrayList<String> sentence = new ArrayList<String>();
        for (String w : words) sentence.add(w);
        for (String w : more) sentence.add(w);
        return sentence;
    }

    public HashMap<Integer, String> buildMap(String[] students) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        for (String s : students) map.put(Integer.parseInt(s), s);
        return map;
    }



}
