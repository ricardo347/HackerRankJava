package br.com.ricardo347;


import br.com.ricardo347.Array2dDS.HourGlass;
import br.com.ricardo347.CountingValleys.Hike;
import br.com.ricardo347.JumpingClouds.Cloud;
import br.com.ricardo347.RepeatedString.Pattern;

public class Main {

    public static void main(String[] args) {
        if(-6 > 0){
            System.out.println("maior");
        }else{
            System.out.println("menor");
        }


        HourGlass h = new HourGlass();
        h.play(h.generate());


    }
}
