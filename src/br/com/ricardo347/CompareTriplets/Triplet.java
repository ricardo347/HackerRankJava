package br.com.ricardo347.CompareTriplets;

import java.util.ArrayList;
import java.util.List;

public class Triplet {
    public Triplet(){

    }

    public int[] generate(){return new int[3];}
    public List<Integer> play(List<Integer> a, List<Integer> b){
        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(0);

        for(int i = 0; i < a.size(); i++){
            if(a.get(i) > b.get(i))
                result.set(0,result.get(0) + 1);

            if (b.get(i) > a.get(i))
                result.set(1,result.get(1) + 1);
        }
        return result;
    }
}
