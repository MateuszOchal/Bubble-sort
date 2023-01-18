package org.example.task2;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BalancedWordsCounter {

    public Integer count(String input) {

        List<String> distinctNumbers = distinct(input);
        List<String> combinationList = new ArrayList<>();
        int count =0;
        if(input.length()>0){  count = input.length() + (input.length() - 1);}
        String temp ;

        if (input == null) {
            throw new RuntimeException();
        }

        if (!(input.matches("[A-Z]*[a-z]*"))) {
            throw new RuntimeException();
        }

        for (int i = 0; i < input.length(); i++) {

            temp = input;
            temp = temp.substring(i);
            for (int j = input.length(); j > 0; j--) {

                int count1 = StringUtils.countMatches(temp, distinctNumbers.get(0));
                int count2 = StringUtils.countMatches(temp, distinctNumbers.get(1));
                int count3 = StringUtils.countMatches(temp, distinctNumbers.get(2));

                if (temp.length() > 2 && count1 == count2 && count1 == count3 ||
                        temp.length() > 2 && count1 == count2 && count3 == 0 ||
                        temp.length() > 2 && count1 == count3 && count2 == 0 ||
                        temp.length() > 2 && count2 == count3 && count1 == 0 ||
                        temp.length() > 2 && count2 == 0 && count2 == count3 && count1 > 2 ||
                        temp.length() > 2 && count1 == 0 && count1 == count3 && count2 > 2 ||
                        temp.length() > 2 && count1 == 0 && count1 == count2 && count3 > 2) {

                    if (!combinationList.contains(temp)) {
                        combinationList.add(temp);
                        count++;
                    }
                }
                temp = StringUtils.chop(temp);
            }
        }
        return count;
    }

    private List<String> distinct(String input) {
        List<String> distinctLetters = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            distinctLetters.add(String.valueOf(input.charAt(i)));
        }
        distinctLetters = distinctLetters.stream().distinct().collect(Collectors.toList());
        return distinctLetters;
    }
}
