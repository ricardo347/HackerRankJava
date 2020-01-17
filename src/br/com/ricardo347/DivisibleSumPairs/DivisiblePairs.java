package br.com.ricardo347.DivisibleSumPairs;

public class DivisiblePairs {
    public DivisiblePairs(){

    }
    public int[] defaultTestGenerator(){
        return new int[]{1,3,2,6,1,2};
    }

    public int run(int n, int k, int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++ ){
                if((arr[i]+ arr[j]) % k == 0){
                    count++;
                    //System.out.printf("%d + %d / %d = %d \n", arr[i], arr[j] ,k, (arr[i]+arr[j])%k );
                }

            }

        }
        System.out.println(count);
        return 0;
    }
}
