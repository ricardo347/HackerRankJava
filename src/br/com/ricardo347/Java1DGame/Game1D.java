package br.com.ricardo347.Java1DGame;

public class Game1D
{
    public Game1D(){

    }

    public int[] defaltTestCaseGenerator(){
        return new int[]{0,0,0,1,1,1};
    }
    public int[] testCase1Generator(){
        return new int[]{0,0,1,1,1,0};
    }
    public int[] testCaseNo1Generator(){
        return new int[]{0,1,1,0,0,1,0,0,1};    }

    public int[] longTestCaseGenerator(){
        return new int[]{0,1,1,0,0,0,1,1,0,1,1,0,0,1,1,1,1,1,1,1,1,1,0,1,1,0,0,1,1,1,0,0,0,1,0,1,1,0,1,1,1,1,1,0,1,1,1,0,1,1,0};
    }

    public boolean play (int leap, int[] game){
        boolean result = true;
        int i = 0;

        while(i < game.length){
        System.out.println("valor do i "+i);
            //move foward
            if(i + 1 < game.length && game[i+1] == 0)
                i++;
            else if(i+leap >= game.length || (leap > 0 && game[i+leap] == 0))
                i+= leap;

            //move backward

           /* else if(i - 1 >= 0 && game[i-1] == 0){
                if(i == 1 || game[i-1] == 1)
                    return false;
                else
                    i--;
            }*/
            //no left moves
            else if(i+1 == game.length)
                return true;
            else
                return false;

        }

        return result;
    }

    /***
     * @param i start position = 0
     * @param leap leap
     * @param game the array
     * @return true = YES, FAL
     */
    public boolean rPlay(int i, int leap, int[] game){
        if(i < game.length && game[i] == 0){
            game[i] = 1;
            if(leap > 0 && rPlay(i+ leap, leap, game))
                return true;
            else if (i > 0 && rPlay(i- 1, leap, game))
                return true;
            else return rPlay(i + 1, leap, game);
        }
        else
            return i >= game.length;
    }
}
