package br.com.ricardo347.DiagonalDifference;

import java.util.ArrayList;
import java.util.List;

public class Matriz {

    public Matriz(){

    }

    public List<List<Integer>> generator(){
        List<List<Integer>> arr = new ArrayList<>();
        /*arr.add(new ArrayList<>());
        arr.get(0).add(1);
        arr.get(0).add(2);
        arr.get(0).add(3);

        arr.add(new ArrayList<>());
        arr.get(1).add(4);
        arr.get(1).add(5);
        arr.get(1).add(6);

        arr.add(new ArrayList<>());
        arr.get(2).add(9);
        arr.get(2).add(8);
        arr.get(2).add(9);*/

        arr.add(new ArrayList<>());
        arr.get(0).add(11);
        arr.get(0).add(2);
        arr.get(0).add(4);

        arr.add(new ArrayList<>());
        arr.get(1).add(4);
        arr.get(1).add(5);
        arr.get(1).add(6);

        arr.add(new ArrayList<>());
        arr.get(2).add(10);
        arr.get(2).add(8);
        arr.get(2).add(-12);

        return arr;
    }

    public int play(List<List<Integer>> arr){
        int cr = arr.size() -1;
        int cl = 0;
        int r =0;
        int l =0;

        for(int i = 0; i < arr.size() ; i++, cl++, cr--){
            r += arr.get(i).get(cr);
            l += arr.get(i).get(cl);
        }
        return Math.abs(l-r);
    }
}
