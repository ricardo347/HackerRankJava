package br.com.ricardo347.BirthdayChocolate;

import java.util.ArrayList;
import java.util.stream.*;
import java.util.Arrays;
import java.util.List;

public class Bar {
    public Bar(){

    }

    public int[] generatorDefaultTestCase(){
        return new int[]{2,2,1,3,2};
    }
    public int[] generatorTestCase1(){
        return new int[]{2,2,1,3,2};
    }


    public int play(int[] s, int d, int m){
        int count = 0;
        for(int i = 0; i <= s.length - m; i++){
            int sum = 0;
            for(int j = i; j <= i+(m-1) ; j++){
                sum += s[j];
            }

            if(sum == d)
                count++;
        }
        return count;
    }
}
