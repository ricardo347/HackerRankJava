package br.com.ricardo347.Array2dDS;

public class HourGlass {

    public HourGlass(){

    }

    public int[][] generate(){
        int[][] arr = new int[6][6];
        arr[0][0] = -1;
        arr[0][1] = -1;
        arr[0][2] = 0;
        arr[0][3] = -9;
        arr[0][4] = -2;
        arr[0][5] = -2;

        arr[1][0] = -2;
        arr[1][1] = -1;
        arr[1][2] = -6;
        arr[1][3] = -8;
        arr[1][4] = -2;
        arr[1][5] = -5;

        arr[2][0] = -1;
        arr[2][1] = -1;
        arr[2][2] = -1;
        arr[2][3] = -2;
        arr[2][4] = -3;
        arr[2][5] = -4;

        arr[3][0] = -1;
        arr[3][1] = -9;
        arr[3][2] = -2;
        arr[3][3] = -4;
        arr[3][4] = -4;
        arr[3][5] = -5;

        arr[4][0] = -7;
        arr[4][1] = -3;
        arr[4][2] = -3;
        arr[4][3] = -2;
        arr[4][4] = -9;
        arr[4][5] = -9;

        arr[5][0] = -1;
        arr[5][1] = -3;
        arr[5][2] = -1;
        arr[5][3] = -2;
        arr[5][4] = -4;
        arr[5][5] = -5;
        /*arr[0][0] = 1;
        arr[0][1] = 1;
        arr[0][2] = 1;
        arr[0][3] = 0;
        arr[0][4] = 0;
        arr[0][5] = 0;

        arr[1][0] = 0;
        arr[1][1] = 1;
        arr[1][2] = 0;
        arr[1][3] = 0;
        arr[1][4] = 0;
        arr[1][5] = 0;

        arr[2][0] = 1;
        arr[2][1] = 1;
        arr[2][2] = 1;
        arr[2][3] = 0;
        arr[2][4] = 0;
        arr[2][5] = 0;

        arr[3][0] = 0;
        arr[3][1] = 0;
        arr[3][2] = 2;
        arr[3][3] = 4;
        arr[3][4] = 4;
        arr[3][5] = 0;

        arr[4][0] = 0;
        arr[4][1] = 0;
        arr[4][2] = 0;
        arr[4][3] = 2;
        arr[4][4] = 0;
        arr[4][5] = 0;

        arr[5][0] = 0;
        arr[5][1] = 0;
        arr[5][2] = 1;
        arr[5][3] = 2;
        arr[5][4] = 4;
        arr[5][5] = 0;*/


        return arr;
    }

    public int play(int[][] arr ){
        int maxvalue = Integer.MIN_VALUE;
        int current = 0;
        int j = 1;
        int i = 0;
        int line = 0;

        while(line < 4){

            current += arr[i+line][j] + arr[i+line][j-1] + arr[i+line][j+1];

            if(i+1  == 3) {

                current -= arr[(i+line)-1][j-1];
                current -= arr[(i+line)-1][j+1];
                System.out.println("Current: "+current+ " | Max: "+maxvalue);
                if (current > maxvalue)
                    maxvalue = current;

                current =0;
                j++;
                i=0;
            }else{
                i++;
            }

            if(j+1 > 5){
                j=1;
                line++;
            }
        }

        System.out.println(maxvalue);
       return 0;
    }
}
