package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] input = {"cat", "tac", "ban", "act", "nab", "bag"};

        Map<String, List<String>> anagramGroups = Arrays.stream(input)
                .collect(Collectors.groupingBy(GroupAnagram::sortChars));
        anagramGroups.entrySet().forEach(e->{
            System.out.println(e.getValue());
        });


    }

    public static String sortChars(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }

        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}


