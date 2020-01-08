package br.com.ricardo347.Pairs;

import java.util.HashSet;
import java.util.Set;

public class Pairs {
    public Pairs(){

    }
    public int[] generate(){
        return new int[]{1,5,3,4,2};
    }
    public int play( int k, int[] arr){
        int sum =0;
        Set<Integer> set = new HashSet<Integer>();
        for(int n=0; n< arr.length; n++){
            set.add(arr[n]);
        }
        for(int n=0; n< arr.length; n++){
            if(set.contains(arr[n]-k)){
                sum+=1;
            }
        }
        System.out.println(sum);
        return sum;
    }
}
