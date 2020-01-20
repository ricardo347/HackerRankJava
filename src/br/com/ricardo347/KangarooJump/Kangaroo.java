package br.com.ricardo347.KangarooJump;

public class Kangaroo {

    public Kangaroo(){

    }

    public void defaultCaseTest(){
        play(14, 4, 98, 2);
        play(0, 2, 5, 3);
        play(0, 3, 4, 2);
        play(28,8,96,2);

    }

    public String play(int x1, int v1, int x2, int v2){
        int a = (x2-x1)*v1+x1;
        int b = ((x2-x1)*(v2+ Math.abs(v2-v1)-1) )+x2;
        System.out.println(v2 +Math.abs(v2-v1)-1);
        System.out.printf("a %d b %d\n", a, b);
        return a==b?"YES":"NO";
    }
}
