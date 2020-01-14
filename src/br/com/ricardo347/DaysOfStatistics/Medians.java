package br.com.ricardo347.DaysOfStatistics;

public class Medians {
    public Medians(){

    }

    public double[] generator(){
        //return new double[]{8,5,4,6,3,1,7,2};
        return new double[]{64630,11735,14216 ,99233,14470,4978,73429,38120,51135,67060};
    }

    public void play(double[] arr){
        arr = sort(arr);
        double mean = 0;
        double median = 0;
        double mode = arr[0];
        int maxcount = 0;
        int count = 1;

        //mean
        for(int j = 0; j < arr.length; j++) {
            mean += arr[j];

            //mode logic
            if(j > 0 && arr[j] == arr[j-1]){
                count++;
                if(count > maxcount){
                    maxcount = count;
                    mode = arr[j];
                }
            }
            else
                count = 1;
        }

        //median
        if(arr.length % 2 == 0)
            median =  (arr[arr.length / 2 -1] + arr[arr.length / 2]) / 2;
        else
            median =  arr[arr.length / 2 + 1];

        System.out.println(mean / arr.length);
        System.out.println("Median "+ median);
        System.out.println("Mode "+ mode);

    }

    public double[] sort(double[] arr){

        int min = 0;
        double aux = 0;

        for(int i = 0; i < arr.length; i++){
            min =  i;
            for(int j = i+1; j < arr.length; j++ ){
                if(arr[j] < arr[min])
                    min = j;
            }
            aux = arr[i];
            arr[i] = arr[min];
            arr[min] = aux;
        }

        return arr;
    }
}
