package br.com.ricardo347.MigratoryBirds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Birds {
    public Birds(){

    }
    //1 2 3 4 5 4 3 2 1 3 4
    public List<Integer> defaultTestCase(){
        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(4);
        result.add(5);
        result.add(4);
        result.add(3);
        result.add(2);
        result.add(1);
        result.add(3);
        result.add(4);
        return result;
    }
    //1 4 4 4 5 3
    public List<Integer> testCase1(){
        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(4);
        result.add(4);
        result.add(4);
        result.add(5);
        result.add(3);

        return result;
    }

    public int run(List<Integer> arr){
        Map<Integer, Integer> birds = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int result = 0;
        for(int i = 0; i < arr.size(); i++){
            if(birds.containsKey(arr.get(i)))
               birds.replace(arr.get(i),birds.get(arr.get(i))+1);
            else
                birds.put(arr.get(i), 1);
            if(birds.get(arr.get(i)) >= max){
                max = birds.get(arr.get(i));
                if(result < arr.get(i))
                    result = arr.get(i);


            }

        }

        System.out.println(result);
        return  result;
    }


}
