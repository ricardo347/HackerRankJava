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
        return new int[]{0,1,1,1,1,0,1,1,1,0,1};
    }

    public int[] longTestCaseGenerator(){
        return new int[]{0,1,1,0,1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,0,0,0,0,1,1,0,1,0,1,1,0,1,0,1,0,1,1,0,0,1,0,1,1,1,1,1,0,1,0,1,1,1,1,1,1,1,1,0,1,1,0,0,0,1,0,1,0,1};
    }



    public boolean play (int leap, int[] game){
        boolean result = true;
        int i = 0;

        while(i < game.length){
        System.out.println("valor do i "+i);
            //move foward
            if(i+leap >= game.length || game[i+leap] == 0)
                i+= leap;
            else if(i + 1 < game.length && game[i+1] == 0)
                i++;
            //move backward
            else if(i - 1 >= 0 && game[i-1] == 0)
                if(i == 1)
                    return false;
                else
                    i--;
            //no left moves
            else
                return false;

        }
        return result;
    }
}
