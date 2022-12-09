package com.springboot.demo.mycoolapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class q46 {

	public static List<List<String>> anagrams(String[] input) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0;i<input.length;i++){
            char str[] = input[i].toCharArray();
            Arrays.sort(str);
            String s = String.valueOf(str);
            if(map.get(s)!=null){
                List<String> a = map.get(s);
                a.add(input[i]);
                map.put(s, a);
            }
            else{
                List<String> a = new ArrayList<>();
                a.add(input[i]);
                map.put(s, a);
            }
        }
        for(Map.Entry<String, List<String>> en:map.entrySet()){
            result.add(en.getValue());
        }
        return result;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        String[] input = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = anagrams(input);
        System.out.println(result);
    }

}