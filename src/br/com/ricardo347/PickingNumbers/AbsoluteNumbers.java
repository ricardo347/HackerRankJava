package br.com.ricardo347.PickingNumbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AbsoluteNumbers {
    public AbsoluteNumbers(){

    }

    public int[] defaultTestCaseGenerator(){
        return new int[]{1,1,2,2,4,4,5,5,5};
    }
    public List<Integer> testCase1Generator(){
        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(2);
        result.add(2);
        result.add(3);
        result.add(1);
        result.add(2);

        return result;
    }
    public int run(List<Integer> arr){
        List<Integer> list = new ArrayList<>();
        int max = 0;
        int count = 0;
        /*for(int i = 0, l = i, r = i;
            i < arr.size();
            i = l < 0 && r+1 >= arr.size()?i+1:i,
                    l=l < 0 && r+1 >= arr.size()?i:l-1,
                    r= (l-1 < 0 && r+1 >= arr.size()?i:r+1) )*/
        while(true)
        {

           System.out.printf("%d - %d - %d\n",i, l, r );

           if(l > 0 && Math.abs(arr.get(i) - arr.get(l)) <= 1){
               count ++;
           }

           if(r  < arr.size() && Math.abs(arr.get(i) - arr.get(r)) <= 1){
               count ++;
           }


           if(count > max)
               max = count;
            //}
        }
        System.out.println(max);
        return 0;
    }


}
