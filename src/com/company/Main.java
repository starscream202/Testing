package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String sentence="25 34 67 89 1000";
        System.out.println(sentence);
        String dollarSign="$";
        String [] strings=sentence.split(" ");

        List<String> strings1=new ArrayList<>();

        for (String words :strings) {
            String modifiedText=dollarSign+words;
            strings1.add(modifiedText);

        }
        for(int i=0;i<strings1.size();i++){
            System.out.println(strings1.get(i));
        }
    }
}
