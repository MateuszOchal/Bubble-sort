package org.example.task1;

import java.util.Collections;
import java.util.List;

public class BubbleSort {
    public  List<Comparable<?>> sort (List<Comparable<?>>input){
        List<Comparable<?>>tempList = input;
        if(input==null){
            throw new RuntimeException();
        }

        for(int i =0; i<input.size(); i++){
            if(input.get(i)==null){
                tempList.remove(i);
            }
        }

        for (int i = 0; i < input.size(); i++) {
            for (int j = 0; j <  input.size()-1; j++) {
                Double value1 = Double.valueOf(String.valueOf(input.get(j)));
                Double value2 = Double.valueOf(String.valueOf(input.get(j+1)));

                    if(value1>value2){
                        Collections.swap(tempList,j,j+1);
                }
            }
       }
        return tempList;
    }
}
