package br.com.ricardo347.PlusMinus;

public class Fraction {
    public Fraction(){

    }

    public int[] generate(){
        int[] arr = new int[6];
        arr[0] = -4;
        arr[1] = 3;
        arr[2] = -9;
        arr[3] = -0;
        arr[4] = 4;
        arr[5] = 1;
        return arr;
    }

    public void play(int[] arr){
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0)
                positive++;
            if(arr[i] < 0)
                negative++;
            if(arr[i] == 0)
                zero++;
        }

        System.out.printf( "%.6f\n",positive/Float.valueOf(arr.length));
        System.out.printf( "%.6f\n",negative/Float.valueOf(arr.length));
        System.out.printf( "%.6f\n",zero/Float.valueOf(arr.length));

    }
}
