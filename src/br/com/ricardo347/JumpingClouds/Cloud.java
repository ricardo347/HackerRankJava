package br.com.ricardo347.JumpingClouds;

import br.com.ricardo347.Challenge;

public class Cloud implements Challenge {

    public Cloud(){

    }

    public int[] generator(){
        int[] a = {0,0,0,0,1,0};
        return a;
    }

    public int play(int[] c){

        int steps = -1;
        for(int i = 0; i < c.length; i++, steps++){
            if(i < c.length - 2 && c[i+2] ==0)
                i++;
        }
        System.out.println(steps);
        return steps;
    }

}
