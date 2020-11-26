package cwiczenia.lekcja15.cwiczenie2.sortowanienapisow;

import java.util.*;

public class Main2 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("b", "k", "z", "k", "a", "w", "k", "n", "k", "a");
        System.out.println(strings);
        Collections.sort(strings);
        System.out.println(strings);
        Collections.reverse(strings);
        System.out.println(strings);
        TreeMap<String, Integer> occurencesMap = countOccurences(strings);
        printMap(occurencesMap);
        Map.Entry<String, Integer> maxEntry = maxOccurences(occurencesMap);
        System.out.println("Najczęściej powtarza się: " + maxEntry);
    }

    static TreeMap<String, Integer> countOccurences(List<String> strings) {
        TreeMap<String, Integer> occurences = new TreeMap<>();
        for (String str : strings) {
            if (occurences.containsKey(str))
                occurences.put(str, occurences.get(str) + 1);
            else
                occurences.put(str, 1);
        }
        return occurences;
    }

    static void printMap(TreeMap<String, Integer> map) {
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);
        }
    }

    static Map.Entry<String, Integer> maxOccurences(TreeMap<String, Integer> map) {
        Map.Entry<String, Integer> maxEntry = map.firstEntry();
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        return maxEntry;
    }
}
