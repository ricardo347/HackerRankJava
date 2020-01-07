package br.com.ricardo347.NewYearCaos;

public class RollerCoaster {

    public RollerCoaster(){

    }

    public int[] generate(){
        int result[] = new int[9];
        /*result[0] = 1;
        result[1] = 2;
        result[2] = 5;
        result[3] = 3;
        result[4] = 7;
        result[5] = 8;
        result[6] = 6;
        result[7] = 4;*/

        result[0] = 1;
        result[1] = 2;
        result[2] = 5;
        result[3] = 3;
        result[4] = 7;
        result[5] = 8;
        result[6] = 9;
        result[7] = 6;
        result[8] = 4;



        return result;

         //  5 1 2 3 7 8 6 4

         //  1 2 5 3 7 8 6 4


    }
    public int play(int[] q){
        int swaps = 0;
        int min = q.length;
        for (int i = q.length - 1; i >= 0; i--){
            if (q[i] - i > 3){
                System.out.println("too caotic");
                break;
            }

            if (q[i] > i+1){
                swaps += (q[i]-(i+1));

            } else {
                if (min > q[i]){
                    min = q[i];
                } else if (q[i] != min){
                    swaps++;
                }
            }
        }


        System.out.println("REsult "+ swaps);
        return swaps;
    }
}
