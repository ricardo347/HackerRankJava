package br.com.ricardo347.MagicSquare;

public class MagicSquare {
    public MagicSquare(){

    }
    public int[][] defautTestCaseGenerator(){
        return new int[][]{{4,9,2},{3,5,7},{8,1,5}};
    }
    public int[][] testCase1Generator(){
        return new int[][]{{4,8,2},{4,5,7},{6,1,6}};
    }

    public int solution1(int[][] arr){
        int sum = 0;
        int min = Integer.MAX_VALUE;

        //All magic squares possible
        int[][][] model = new int[][][]
                {       {{4,9,2},{3,5,7},{8,1,6}},
                        {{8,3,4},{1,5,9},{6,7,2}},
                        {{6,1,8},{7,5,3},{2,9,4}},
                        {{2,7,6},{9,5,1},{4,3,8}},
                        {{8,1,6},{3,5,7},{4,9,2}},
                        {{4,3,8},{9,5,1},{2,7,6}},
                        {{2,9,4},{7,5,3},{6,1,8}},
                        {{6,7,2},{1,5,9},{8,3,4}}
                };

        // 2 for loops: first to iterate over all possible magic squares, to comparating
        //which is the most similar to the test case being evaluted
        for(int x = 0; x < model.length; x++){
            sum = 0;
            //second for to interate over the test case comparing individually all nodes
            for(int y = 0; y<9; y++){
                sum += Math.abs(arr[y/3][y%3] - model[x][y/3][y%3]);
            }
            //it takes the lowest cost
            if(sum < min)
                min = sum;
        }
        return min;
    }

}

