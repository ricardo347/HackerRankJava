package br.com.ricardo347.BetweenTwoSets;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Set {
    public Set(){

    }

    public int defaultTestCase(){
        return 0;
    }

    public int play(List<Integer> a, List<Integer> b){
        List<Integer> results = new ArrayList<>();
        int count = 0;
        //b.get(0) contains the MIN value for a factor, once arrays are sorted, no other value will be
        //greater than MIN factor of b.
        for(int i = b.get(0); i > 0; i--){
          if(getFactoriesB(0, i, b ) && getFactoriesA(0, i, a ))
            System.out.printf("%d ",i);
            count++;
        }
        return count;
    }

    public boolean getFactoriesB(int next, int factor, List<Integer> arr){
        if(next == arr.size())
            return true;
        return arr.get(next) % factor == 0 && getFactoriesB(next + 1, factor, arr);
    }
    public boolean getFactoriesA(int next, int factor, List<Integer> arr){
        if(next == arr.size())
            return true;
        return factor % arr.get(next) == 0 && getFactoriesA(next + 1, factor, arr);
    }



}
