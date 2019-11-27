package br.com.ricardo347;


import br.com.ricardo347.CountingValleys.Hike;

public class Main {

    public static void main(String[] args) {
        Hike h = new Hike();
        h.countingValleys(8, h.generator());
    }
}
