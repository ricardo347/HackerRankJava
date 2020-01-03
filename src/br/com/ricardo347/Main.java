package br.com.ricardo347;


import br.com.ricardo347.CountingValleys.Hike;
import br.com.ricardo347.JumpingClouds.Cloud;

public class Main {

    public static void main(String[] args) {
        Cloud c = new Cloud();
        c.play(c.generator());

    }
}
