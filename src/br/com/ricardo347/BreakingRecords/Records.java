package br.com.ricardo347.BreakingRecords;

public class Records {
    public Records(){

    }

    public int[] generate(){
        return new int[] {10,5,20,20,4,5,2,25,1};
    }
    public int[] play(int[] scores){
        int min = scores[0];
        int max = scores[0];
        int[] result = new int[scores.length];

        for(int i = 1; i < scores.length; i++){
            if(scores[i] < min){
                min = scores[i];
                result[1] ++;}
            else if (scores[i] > max){
                max = scores[i];
                result[0] ++;}
        }
        System.out.print(result[0]);
        System.out.print(" "+result[1]);
        return scores;
    }
}
