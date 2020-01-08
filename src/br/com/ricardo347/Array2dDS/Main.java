package br.com.ricardo347.Array2dDS;


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
