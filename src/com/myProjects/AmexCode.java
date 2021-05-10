package com.myProjects;

import java.util.HashMap;
import java.util.*;
import java.util.Map;

public class AmexCode {

    public static void main(String ... args) {
        String input = "abcadefghijabcde";

        char[] cc = input.toCharArray();
        List<char[]> list;
        list = Arrays.asList(cc);

        int start = 0;
        int currentStart = 0;
        int end = start+1;
        char[] chars = input.toCharArray();

        int MAX_LENGTH = Integer.MIN_VALUE;

        Map<Character, Boolean> map = new HashMap<>();

        map.put(chars[currentStart], true);
        int currentLength = 1;

        for(int i=1;i<input.length();i++) {
            if(map.get(chars[i]) != null) {
                /*currentStart = i;
                //end = currentStart;*/
                currentLength = 1;

            } else {
                map.put(chars[i], true);
                currentLength++;
                if (MAX_LENGTH < currentLength) {
                    MAX_LENGTH = currentLength;
                    /*start = currentStart;
                    end = i;*/
                }
                continue;
            }
        }

        System.out.println("Maximum length : " + MAX_LENGTH);
        /*System.out.println("Start index : " + start);
        System.out.println("end index : " + end);*/

    }

}
