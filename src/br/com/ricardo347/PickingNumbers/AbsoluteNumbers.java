package br.com.ricardo347.PickingNumbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AbsoluteNumbers {
    public AbsoluteNumbers(){

    }
   //{1,1,2,2,4,4,5,5,5}
    public List<Integer> defaultTestCaseGenerator(){
        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(1);
        result.add(2);
        result.add(2);
        result.add(4);
        result.add(4);
        result.add(5);
        result.add(5);
        result.add(5);
        return result;
    }
    //{1,2,2,3,1,2}
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
    //4 6 5 3 3 1
    public List<Integer> testCase2Generator(){
        List<Integer> result = new ArrayList<>();

        result.add(4);
        result.add(6);
        result.add(5);
        result.add(3);
        result.add(3);
        result.add(1);
        return result;
    }
    public List<Integer> testCase3Generator(){
        List<Integer> list = new ArrayList<>();
        int[] a = new int[]{14,18,17,10,9,20,4,13,19,19,8,15,15,17,6,5,15,12,18,2,18,7,20,8,2,8,11,2,16,2,12,9,3,6,9,9,13,7,4,6,19,7,2,4,3,4,14,3,4,9,17,9,4,20,10,16,12,1,16,4,15,15,9,13,6,3,8,4,7,14,16,18,20,11,20,14,20,12,15,4,5,10,10,20,11,18,5,20,13,4,18,1,14,3,20,19,14,2,5,13};
        for(int item : a){
            list.add(item);
        }
        return list;
    }
    public int run(List<Integer> arr){
        List<Integer> list = new ArrayList<>();
        int max = 0;
        int min ;
        int count;

        for(int i = 0; i < arr.size(); i++){
            //reinicializes counter and min every array member avaliation
            count = 0;
            //min repre
            min = 0;
            for(int j = 0; j < arr.size(); j++ ) {

                int absValue = Math.abs(arr.get(j) - arr.get(i));
                int currentDiff = (arr.get(j) - arr.get(i));
                if( absValue <= 1 &&  Math.abs(min < currentDiff ? min - currentDiff: currentDiff - min) <= 1  ){
                    count++;
                   //if(i==6)System.out.printf("%d %d\n",j,arr.get(j));
                    if(absValue > 0 && min == 0)
                        min = (arr.get(j) - arr.get(i));
                        //min = Math.abs(arr.get(j) - arr.get(i));
                }
            }
                //
            //if(count == 14) System.out.printf("%d  %d \n", i , arr.get(i));
            if(count > max)
                max = count;
        }
        //System.out.println(max);
        return 0;
    }


}
