package br.com.ricardo347.Subarray;

public class Subarray {
    public Subarray(){

    }

    public void play(){
        int[] arr = new int[]{1,-2,4,-5,1};
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            //count += negativeSubarray(i,0,arr);
            count += negativeSubarrayV2(i,arr);
        System.out.println("Final "+count);}

    }

    public int negativeSubarray(int n, int j, int[] arr){
        if(n >= arr.length || j >= arr.length)
            return 0;
        int sum = 0;
        for(int i = n; i < j+1;i++){
            System.out.printf("%d ",i);
            sum += arr[i];
        }
        System.out.println(" sum: " +sum);


        return (sum < 0?1:0) + negativeSubarray(n, j+1, arr);

    }
    public int negativeSubarrayV2(int n,  int[] arr){
        if(n >= arr.length)
            return 0;
        System.out.printf("%d ",n);

        int sum = (arr[n] + negativeSubarrayV2(n+1, arr));
        System.out.println("n+1 "+(arr[n]));
        return (arr[n] + negativeSubarrayV2(n+1, arr)) ;//< 0 ? 1 : 0;
        //System.out.println("sum "+sum);

    }

}
