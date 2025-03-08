package org.example.test;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args){
        String[] str = {"ABC","BCD","ABC","BCD","POP","WER"};
        filterDuplicates(str).forEach(System.out::println);
    }

    private static List filterDuplicates(String[] str) {
        List<String> uniqueElements = new ArrayList<>();
        for(String value : str){
            if(!uniqueElements.contains(value)){
                uniqueElements.add(value);
            }
        }
        return uniqueElements;
    }

}
