package br.com.ricardo347.Array2dDS;

public class HourGlass {

    public HourGlass(){

    }

    public int[][] generate(){
        int[][] arr = new int[6][6];
        arr[0][0] = 1;
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
        arr[5][5] = 0;


        return arr;
    }

    public int play(int[][] arr ){
        int maxvalue = 0;
        int current = 0;

        for(int i = 1 ; i <= 36 ; i++){
            //razão matematica para criar x
            int a = (i / 6) - (i%6==0?1:0);
            //razao matematica para criar y
            int b = (i-a*6)-1;

            System.out.println(arr[a][b]);
           // System.out.println(a);

        }
        return 0;
    }
}
