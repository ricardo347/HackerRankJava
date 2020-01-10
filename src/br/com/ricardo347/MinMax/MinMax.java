package br.com.ricardo347.MinMax;

public class MinMax {
    public MinMax(){

    }

    public int[] generate(){
        int[] arr = {1,2,3,4,5};
        //int[] arr = {1,3,5,7,9};

        return arr;
    }

    public void play(int[] arr){
        long min = Long.MAX_VALUE;
        long max = 0;
        long tmp = 0;
        long sum = 0;

        for(int i = 0; i < arr.length; i++){
            tmp = arr[i];
            max  = tmp > max ? tmp : max;
            min  = tmp < min ? tmp : min;
            sum += tmp;
        }

        System.out.println((sum - max) + " " + (sum - min));
    }
}
